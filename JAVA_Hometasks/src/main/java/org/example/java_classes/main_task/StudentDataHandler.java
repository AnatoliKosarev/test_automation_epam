package org.example.java_classes.main_task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;

public class StudentDataHandler {
    private final ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToList(Student student) {
        studentList.add(student);
    }

    /**
     * вывести список студентов заданного факультета
     * @param faculty заданный факультет
     */
    public void printStudentListForCertainFaculty(String faculty) {
        studentList.sort(Comparator.comparing(Student::getLastName));
        System.out.println("\nСписок студентов факультета: " + faculty);
        for (Student student: studentList) {
            if (student.getFaculty().getTitle().equals(faculty)) {
                System.out.println(student);
            }
        }
    }

    /**
     * вывести список студентов заданного курса
     * @param course заданный курс
     */
    public void printStudentListForCertainCourse(String course) {
        studentList.sort(Comparator.comparing(Student::getLastName));
        System.out.println("\nСписок студентов курса: " + course);
        for (Student student: studentList) {
            if (student.getCourse().getTitle().equals(course)) {
                System.out.println(student);
            }
        }
    }

    /**
     * вывести списки студентов для каждого факультета и курса
     */
    public void printStudentListForAllFacultiesAndCourses() {
        studentList.sort(Comparator.comparing(Student::getCourse));
        System.out.println("Список студентов с разбивкой по факультетам");
        for (Faculty faculty : Faculty.values()) {
            printStudentListForCertainFaculty(faculty.getTitle());
        }
        System.out.println("\nСписок студентов с разбивкой по курсам");
        for (Course course : Course.values()) {
            printStudentListForCertainCourse(course.getTitle());
        }
    }

    /**
     * вывести список студентов, родившихся после заданного года
     * @param year заданный год
     */
    public void printStudentListBornAfterCertainYear(int year) {
        studentList.sort(Comparator.comparing(Student::getBirthDate));
        System.out.println("\nСписок студентов, родившихся после " + year + " года.");
        for (Student student : studentList) {
            if (student.getBirthDate().get(Calendar.YEAR) > year) {
                System.out.println(student);
            }
        }
    }

    /**
     * вывести список учебной группы
     * @param group заданная учебная группа
     */
    public void printStudentListForCertainGroup(String group) {
        studentList.sort(Comparator.comparing(Student::getLastName));
        System.out.println("\nСписок студентов группы: " + group);
        for (Student student : studentList) {
            if (student.getGroup().getTitle().equals(group)) {
                System.out.println(student);
            }
        }

    }
}