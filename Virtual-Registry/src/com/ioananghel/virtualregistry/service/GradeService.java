package com.ioananghel.virtualregistry.service;

import com.ioananghel.virtualregistry.model.Grade;
import com.ioananghel.virtualregistry.model.Registry;

import java.util.List;

public interface GradeService
{
    Registry registry = Registry.getInstance();
    List<Grade> getGradesByStudentId(String studentId);
}
