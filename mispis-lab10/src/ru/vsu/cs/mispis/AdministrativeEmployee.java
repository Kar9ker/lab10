package ru.vsu.cs.mispis;

public class AdministrativeEmployee extends Employee {

    /**
     * 
     * @param employee
     */
    public void paySalary(Employee employee) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
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
    public AdministrativeEmployee(int id, String name, java.util.Date dateOfBirth, String email, int salary) {
        super(id, name, dateOfBirth, email, salary);
    }

}