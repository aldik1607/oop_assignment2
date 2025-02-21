package models;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void giveRaise(double percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Invalid percentage");
        }
        salary += salary * (percent / 100);
    }
    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}
