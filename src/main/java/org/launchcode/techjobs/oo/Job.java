package org.launchcode.techjobs.oo;

import java.util.Objects;
import java.util.StringJoiner;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // First constructor to initialize a unique ID
    public Job() {
        id = nextId;
        nextId++;
    }
    // Second constructor to initialize all fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");
        sj.add("ID: " + this.id);
        sj.add("Name: " + this.name);
        sj.add("Employer: " + this.employer.getValue());
        sj.add("Location: " + this.location.getValue());
        sj.add("Position Type: " + this.positionType.getValue());
        sj.add("Core Competency: " + this.coreCompetency.getValue());
        return sj.toString();
    }

    // Custom equals method
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Job job = (Job) o;
        return id == job.id;
    }

    // Custom hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
