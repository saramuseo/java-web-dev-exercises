package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return "The following students are enrolled in the " + this.topic + " class, taught by " + this.instructor + ": " + this.enrolledStudents;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object courseToCheck) {

        if (courseToCheck == this) {
            return true;
        }

        if (courseToCheck == null) {
            return false;
        }

        if (courseToCheck.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) courseToCheck;
        return theCourse.getTopic() == getTopic();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
