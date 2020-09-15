package org.example.java_classes.main_task;

public enum Faculty {

    PHILOSOPHY("Философский"),
    PSYCHOLOGY("Психологии"),
    CHEMISTRY("Химический"),
    CYBERNETICS("Кибернетики");

    private String title;

    Faculty(String title) {
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
