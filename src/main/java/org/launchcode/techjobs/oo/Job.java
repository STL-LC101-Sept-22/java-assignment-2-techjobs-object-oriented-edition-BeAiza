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

    @Override
    public String toString() {
        String nameValue = (Objects.equals(name, "")) ? "Data not available" : name;
        String employerValue = (employer == null || Objects.equals(employer.getValue(), "")) ? "Data not available" : employer.getValue();
        String locationValue = (location == null || Objects.equals(location.getValue(), "")) ? "Data not available" : location.getValue();
        String positionTypeValue = (positionType == null || Objects.equals(positionType.getValue(), "")) ? "Data not available" : positionType.getValue();
        String coreCompetencyValue = (coreCompetency == null || Objects.equals(coreCompetency.getValue(), "")) ? "Data not available" : coreCompetency.getValue();

        return "\nID: " + id +
                "\nName: " + nameValue +
                "\nEmployer: " + employerValue +
                "\nLocation: " + locationValue +
                "\nPosition Type: " + positionTypeValue +
                "\nCore Competency: " + coreCompetencyValue +
                "\n";
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

    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }
// why is this not getting
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
