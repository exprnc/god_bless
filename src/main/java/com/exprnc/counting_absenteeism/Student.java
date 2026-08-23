package com.exprnc.counting_absenteeism;

import java.util.Objects;

class Student {

    private final String name;
    private final String faculty;
    private final int year;

    Student(String name, String faculty, int year) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(faculty);
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }

    String getName() {
        return name;
    }

    String getFaculty() {
        return faculty;
    }

    int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        var student = (Student) obj;
        return Objects.equals(name, student.name)
                && Objects.equals(faculty, student.faculty)
                && year == student.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, year);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", year=" + year +
                '}';
    }
}
