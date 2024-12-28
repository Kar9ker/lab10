package ru.vsu.cs.mispis;

import java.util.ArrayList;

public class Project {

    public String name = "";
    public java.util.Date start = null;
    public java.util.Date end = null;
    public java.util.List<String> reports = new ArrayList<>();

    public double duration() {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param researchAssociate
     */
    public void createReport(ResearchAssociate researchAssociate) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param name
     * @param start
     * @param end
     */
    public Project(String name, java.util.Date start, java.util.Date end) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

}