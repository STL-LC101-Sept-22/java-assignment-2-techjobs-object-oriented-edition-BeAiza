package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        if (value == null || value.isBlank()) {
            this.value = "Data not available";
        } else {
            this.value = value;
        }
    }
    // Custom toString, equals, and hashCode methods:
    @Override
    public String toString() {
        return value;
    }
    // Two objects are equal if they have the same id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
//    public void setValue(String value) {
//        this.value = value;
//    }
}

