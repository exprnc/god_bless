package com.exprnc.counting_absenteeism;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Main {

    static void main() {
        var system = new StudentAccountingSystem();

        system.addStudent(new Student("Иванов Иван", "Math", 1));
        var removableStudent = new Student("Петров Пётр", "Math", 1);
        system.addStudent(removableStudent);
        system.addStudent(new Student("Сидорова Анна", "Physics", 2));
        var secondMathFacultyCourse = new FacultyCourse("Math", 2);
        system.addStudent(new Student("Козлов Дмитрий", secondMathFacultyCourse.getFaculty(), secondMathFacultyCourse.getYear()));
        system.addStudent(new Student("Смирнова Елена", "Physics", 1));

        system.printAllStudents();
        system.printStudentsGroupedByFacultyCourse();
        system.removeStudent(removableStudent.getName(), removableStudent.getFaculty(), removableStudent.getYear());
        system.printAllStudents();
        system.printStudentsGroupedByFacultyCourse();
        log.info("{}", system.getStudentsByFacultyCourse(secondMathFacultyCourse.getFaculty(), secondMathFacultyCourse.getYear()));
    }

}
