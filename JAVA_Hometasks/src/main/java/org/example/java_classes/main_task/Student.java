package org.example.java_classes.main_task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    private String firstName;
    private String patronymic;
    private String lastName;
    private Calendar birthDate;
    private String address;
    private String phoneNumber;
    private Course course;
    private Faculty faculty;
    private Group group;

    public Student() {}

    public Student(String lastName, String firstName, String patronymic, Calendar birthDate, String address,
                   String phoneNumber, Course course, Faculty faculty, Group group) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.faculty = faculty;
        this.group = group;
    }

    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy ");

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("Фамилия:%s\t\tИмя:%s\t\tОтчество:%s\t\tДата рождения:%s\t\tАдрес:%s\t\tТелефон:%s\t\tКурс:%s\t\t" +
                "Факультет:%s\t\tГруппа:%s", lastName, firstName, patronymic, dateFormat.format(birthDate.getTime()), address, phoneNumber, course, faculty, group);
    }
}
