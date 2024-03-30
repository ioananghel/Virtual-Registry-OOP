package com.ioananghel.virtualregistry;

import java.util.ArrayList;
import java.util.List;

public class RunApp {
    public static void main(String[] args)
    {
        List<Subject> currentlyAttending = new ArrayList<>();
        Subject maths = new Subject("Mathematics", 3, 3);
        currentlyAttending.add(maths);
        List<Grade> grades = new ArrayList<>();
        Grade mathematicsGrade = new Grade(maths, 10.0);
        grades.add(mathematicsGrade);
        Student student = new Student("anghel", "ioan", "50207", "fundulea", "070sanse", "07", 3, 10.0, currentlyAttending, grades);
        System.out.println(student.getName());
        System.out.println(student.getInfo());
        System.out.println(student.getAllInfo());

        List<Subject> studentSubjects = student.getCurrentlyAttending();
        studentSubjects.forEach(subject ->
                System.out.println(subject.getName() + ", " + subject.getNumberOfCredits())
        );

        List<Grade> studentGrades = student.getGrades();
        studentGrades.forEach(grade ->
                System.out.println(grade.getSubject().getName() + ", " + grade.getGrade())
        );
    }
}
