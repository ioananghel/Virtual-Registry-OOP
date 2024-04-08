package com.ioananghel.virtualregistry.service;

import com.ioananghel.virtualregistry.model.Grade;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherGradeService implements GradeService {

    private final List<Grade> grades;

    public TeacherGradeService(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public List<Grade> getGradesByStudentId(String registrationNumber){
        return grades.stream()
                .filter(grade -> grade.getRegistrationNumber().equals(registrationNumber))
                .collect(Collectors.toList());
    }

    // Add a method for teachers to add grades
    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }
}
