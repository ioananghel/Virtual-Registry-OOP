package com.ioananghel.virtualregistry;

import com.ioananghel.virtualregistry.model.*;
import com.ioananghel.virtualregistry.service.StudentGradeService;
import com.ioananghel.virtualregistry.service.TeacherGradeService;

import java.util.ArrayList;
import java.util.List;

public class RunApp {
    public static void main(String[] args)
    {
        List<Subject> currentlyAttending = new ArrayList<>();
        Subject maths = new Subject("Mathematics", 3, 3);
        currentlyAttending.add(maths);
        List<Grade> grades = new ArrayList<>();
        Grade mathematicsGrade = new Grade("07", maths, 10.0);
        grades.add(mathematicsGrade);
        Student student = new Student("anghel", "ioan", "50207", "fundulea", "070sanse", "07", 3, currentlyAttending);
        System.out.println(student.getName());
        System.out.println(student.getInfo());
        System.out.println(student.getAllInfo());

        List<Subject> studentSubjects = student.getCurrentlyAttending();
        studentSubjects.forEach(subject ->
                System.out.println(subject.getName() + ", " + subject.getNumberOfCredits())
        );

//        List<Grade> studentGrades = student.getGrades();
//        studentGrades.forEach(grade ->
//                System.out.println(grade.getSubject().getName() + ", " + grade.getGrade())
//        );

        Registry registry = Registry.getInstance();
        registry.setGrades(grades);
        System.out.println("Grades:");
        StudentGradeService gradeService = new StudentGradeService();
        List<Grade> studentGrades = gradeService.getGradesByStudentId("07");
        studentGrades.forEach(grade ->
                System.out.println(grade.getSubject().getName() + ", " + grade.getGrade())
        );

        System.out.println("Teacher part: ");

        List<Subject> subjects = new ArrayList<>();
        subjects.add(maths);
        List<Subject> teacherSubjects = new ArrayList<>();
        teacherSubjects.add(maths);
        Teacher teacher = new Teacher("anghel", "ioan", "50207", "fundulea", "070sanse", teacherSubjects);
        System.out.println(teacher.getName());

        List<Grade> teacherGrades = new ArrayList<>();
        Grade teacherGrade = new Grade("07", maths, 10.0);
        teacherGrades.add(teacherGrade);
        TeacherGradeService teacherGradeService = new TeacherGradeService(teacherGrades);
        List<Grade> gradesByStudentId = teacherGradeService.getGradesByStudentId("07");
        gradesByStudentId.forEach(grade ->
                System.out.println(grade.getSubject().getName() + ", " + grade.getGrade())
        );
    }
}
