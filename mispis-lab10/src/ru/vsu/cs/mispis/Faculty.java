package ru.vsu.cs.mispis;

public class Faculty {

    public String name = "";
    public java.util.Date dateOfCreation = null;
    public String officeAdress = "";
    public Employee dean = null;

    public double creationYear() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param newOfficeAdress
     */
    public void changeOfficeAdress(String newOfficeAdress) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param dean
     * @param name
     * @param dateOfCreation
     * @param officeAdress
     */
    public Faculty(Employee dean, String name, java.util.Date dateOfCreation, String officeAdress) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}