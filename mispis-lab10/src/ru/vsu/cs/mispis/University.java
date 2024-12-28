package ru.vsu.cs.mispis;

public class University {

    public String name = "";
    public java.util.Date dateOfCreation = null;
    public String mainOfficeAdress = "";
    public Employee rector = null;

    /**
     * 
     * @param newOfficeAdress
     */
    public void changeOfficeAdress(String newOfficeAdress) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param rector
     * @param name
     * @param dateOfCreation
     * @param mainOfficeAdress
     */
    public University(Employee rector, String name, java.util.Date dateOfCreation, String mainOfficeAdress) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}