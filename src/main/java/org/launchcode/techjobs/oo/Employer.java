package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }
    @Override
    public String toString() {
        if (getValue().equals("")) {
            return "Employer: Data not available\n";
        } else {
            return "Employer: " + getValue() + "\n";
        }
    }
// If the 'value' field is empty, the method returns the string "Employer: Data not available\n".
}
