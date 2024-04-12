package com.ioananghel.virtualregistry.model;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Registry {
    private List<Grade> grades;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Subject> subjects;
    ///this will be singleton class:
    private static Registry instance;
    private Registry() {
    }
    public static Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }
    public List<Grade> getGrades() {
//        return grades;
        Collections.sort(grades, new Comparator<Grade>() {
            @Override
            public int compare(Grade g1, Grade g2) {
                return Double.compare(g2.getGrade(), g1.getGrade());
            }
        });
        return grades;
    }
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public List<Subject> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
    public List<Grade> getGradesByStudentId(String registrationNumber) {
        return grades.stream()
                .filter(grade -> grade.getRegistrationNumber().equals(registrationNumber))
                .collect(Collectors.toList());
    }
}
