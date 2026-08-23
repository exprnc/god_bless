package com.exprnc.counting_absenteeism;

import java.util.Objects;

class FacultyCourse {

    private final String faculty;
    private final int year;

    FacultyCourse(String faculty, int year) {
        Objects.requireNonNull(faculty);
        this.faculty = faculty;
        this.year = year;
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
        var facultyCourse = (FacultyCourse) obj;
        return Objects.equals(faculty, facultyCourse.faculty) && year == facultyCourse.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, year);
    }

    @Override
    public String toString() {
        return "FacultyCourse{" +
                "faculty='" + faculty + '\'' +
                ", year=" + year +
                '}';
    }
}
