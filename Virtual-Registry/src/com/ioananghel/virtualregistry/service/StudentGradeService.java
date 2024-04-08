package com.ioananghel.virtualregistry.service;

import com.ioananghel.virtualregistry.model.Grade;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGradeService implements GradeService
{

    private String registrationNumber;

    public StudentGradeService() {
    }
    public StudentGradeService(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public List<Grade> getGradesByStudentId(String studentId) {
        return registry.getGrades().stream()
                .filter(grade -> grade.getRegistrationNumber().equals(studentId))
                .collect(Collectors.toList());
    }
}
