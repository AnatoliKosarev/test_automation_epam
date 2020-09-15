package org.example.java_classes.main_task;

public enum Course {
    FIRST("1"),
    SECOND("2"),
    THIRD("3"),
    FOURTH("4"),
    FIFTH("5"),
    MAGISTRACY("Магистратура");


    private String title;

    Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }


}
