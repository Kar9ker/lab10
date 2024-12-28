package ru.vsu.cs.mispis;

public class Employee {

    public int id = 0;
    public String name = "";
    public java.util.Date dateOfBirth = null;
    public String email = "";
    public int salary = 0;
    public int balance = 0;
    public static int counter = 0;

    public void getSalary() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param newSalary
     */
    public void changeSalary(int newSalary) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param id
     * @param name
     * @param dateOfBirth
     * @param email
     * @param salary
     */
    public Employee(int id, String name, java.util.Date dateOfBirth, String email, int salary) {
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}