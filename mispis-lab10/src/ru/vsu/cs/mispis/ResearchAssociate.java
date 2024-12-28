package ru.vsu.cs.mispis;

public class ResearchAssociate extends Employee {

    public String fieldOfStudy = "";

    /**
     * 
     * @param project
     */
    public void startProject(Project project) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param id
     * @param name
     * @param dateOfBirth
     * @param email
     * @param salary
     * @param fieldOfStudy
     */
    public ResearchAssociate(int id, String name, java.util.Date dateOfBirth, String email, int salary, String fieldOfStudy) {
        super(id, name, dateOfBirth, email, salary);
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}