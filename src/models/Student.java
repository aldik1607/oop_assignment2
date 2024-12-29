package models;

import java.util.ArrayList;

public class Student extends Person {
    private static int nextID = 1;
    private int studentID;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student() {
        this.studentID = nextID++;
    }

    public int getStudentID() {
        return studentID;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
        else {
            System.out.println("Grade is out of range");
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (int grade : grades) {
            total += (grade / 100.0) * 4.0;
        }
        return total / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + ". I am a student with ID " + studentID + ".";
    }
}
