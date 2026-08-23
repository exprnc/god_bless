package com.exprnc.counting_absenteeism;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Slf4j
class StudentAccountingSystem {

    private final Set<Student> students = new LinkedHashSet<>();
    private final Map<FacultyCourse, Set<Student>> studentsGroupedByFacultyCourse = new HashMap<>();

    void addStudent(Student student) {
        Objects.requireNonNull(student);
        if (!students.add(student)) {
            return;
        }
        var facultyCourse = buildFacultyCourse(student.getFaculty(), student.getYear());
        studentsGroupedByFacultyCourse.computeIfAbsent(facultyCourse, _ -> new LinkedHashSet<>())
                .add(student);
    }

    void removeStudent(String name, String faculty, int year) {
        var student = new Student(name, faculty, year);
        if (!students.remove(student)) {
            return;
        }
        var facultyCourse = buildFacultyCourse(student.getFaculty(), student.getYear());
        var groupedStudents = studentsGroupedByFacultyCourse.get(facultyCourse);
        if (groupedStudents != null && groupedStudents.remove(student) && groupedStudents.isEmpty()) {
            studentsGroupedByFacultyCourse.remove(facultyCourse);
        }
    }

    Set<Student> getStudentsByFacultyCourse(String faculty, int year) {
        var facultyCourse = buildFacultyCourse(faculty, year);
        var groupedStudents = studentsGroupedByFacultyCourse.get(facultyCourse);
        return groupedStudents != null
                ? Collections.unmodifiableSet(groupedStudents)
                : Collections.emptySet();
    }

    void printStudentsGroupedByFacultyCourse() {
        studentsGroupedByFacultyCourse.forEach((facultyCourse, groupedStudents) ->
                log.info("{} {}", facultyCourse, groupedStudents));
    }

    void printAllStudents() {
        log.info("{}", students);
    }

    private FacultyCourse buildFacultyCourse(String faculty, int year) {
        return new FacultyCourse(faculty, year);
    }
}
