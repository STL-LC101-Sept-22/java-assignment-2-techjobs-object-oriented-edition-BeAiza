package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getId());
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");
        Job job1 = new Job("Product tester", employer, location, positionType, coreCompetency);
        Job job2 = new Job("Product tester", employer, location, positionType, coreCompetency);
        job1.setId(1);
        job2.setId(2);
        assertFalse(job1.equals(job2));
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job();
        String toString = job.toString();
        assertEquals("\n" + toString + "\n", toString);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job();
        job.setId(1);
        job.setId("Software Engineer");
        job.setEmployer(new Employer("LaunchCode"));
        job.setLocation(new Location("St. Louis, MO"));
        job.setPositionType(new PositionType("Full-Time"));
        job.setCoreCompetency(new CoreCompetency("Java"));

        String toString = job.toString();
        assertTrue(toString.contains("ID: 1\n"));
        assertTrue(toString.contains("Name: Software Engineer\n"));
        assertTrue(toString.contains("Employer: LaunchCode\n"));
        assertTrue(toString.contains("Location: St. Louis, MO\n"));
        assertTrue(toString.contains("Position Type: Full-Time\n"));
        assertTrue(toString.contains("Core Competency: Java\n"));

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job();
        job.setId(1);
        String toString = job.toString();
        assertTrue(toString.contains("ID: 1\n"));
        assertTrue(toString.contains("Name: Software Engineer\n"));
        assertTrue(toString.contains("Employer: LaunchCode\n"));
        assertTrue(toString.contains("Location: St. Louis, MO\n"));
        assertTrue(toString.contains("Position Type: Full-Time\n"));
        assertTrue(toString.contains("Core Competency: Java\n"));
    }
}