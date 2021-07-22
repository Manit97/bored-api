package com.sparta.ms.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Arrays;

@JsonPropertyOrder({"Name, Age, Courses"})
public class StudentPojo {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Age")
    private int age;

    @JsonProperty("Courses")
    private String[] courses;

    public StudentPojo(String name, int age, String[] courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public StudentPojo(){

    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Age")
    public int getAge() {
        return age;
    }
    @JsonProperty("Age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("Courses")
    public String[] getCourses() {
        return courses;
    }
    @JsonProperty("Courses")
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
