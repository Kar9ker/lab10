package ru.vsu.cs.mispis;

public class Lecturer extends ResearchAssociate {

    /**
     * 
     * @param classNumber
     */
    public void conductClass(int classNumber) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param ssNo
     * @param name
     * @param dateOfBirth
     * @param email
     * @param salary
     */
    public Lecturer(int id, String name, java.util.Date dateOfBirth, String email, int salary, String fieldOfStudy) {
        super(id, name, dateOfBirth, email, salary, fieldOfStudy);
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}