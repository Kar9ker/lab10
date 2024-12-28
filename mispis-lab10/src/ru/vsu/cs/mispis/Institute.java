package ru.vsu.cs.mispis;

import java.util.*;

public class Institute {

    public String name = "";
    public java.util.Date dateOfCreation = null;
    public String adress = "";
    public List<ResearchAssociate> researchAssociates = null;
    public ArrayList<ResearchAssociate> attribute = new ArrayList<>();
    public ArrayList<ResearchAssociate> attribute2 = new ArrayList<>();

    public double age() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param newAdress
     */
    public void changeAdress(String newAdress) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param researchAssociate
     */
    public void addResearchAssociate(ResearchAssociate researchAssociate) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param name
     * @param dateOfCreation
     * @param adress
     */
    public Institute(String name, Date dateOfCreation, String adress) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}