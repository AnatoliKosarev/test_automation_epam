package org.example.java_classes.main_task;

public enum Group {
    EC1("Ec-1"),
    EC2("Ec-2"),
    PSY1("Psy-1"),
    PSY2("Psy-2"),
    LAW1("Law-1"),
    LAW2("Law-2"),
    CS1("Cs-1"),
    CS2("Cs-2");

    private String title;

    Group(String title) {
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
