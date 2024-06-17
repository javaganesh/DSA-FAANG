package com.dsa.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(new Student(101,"Ganesh"),
                new Student(102,"RamKrishna"),
                new Student(103,"Supriya"),
                new Student(104,"Supriya")

                );
      /*  Map<String, Student> nameWithStudent = studentList.
                stream().
                collect(Collectors.
                        toMap(student -> student.getName(), student -> student));
        System.out.println(nameWithStudent);
   */     Map<String, List<Student>> nameWithStudents2 = studentList
                .stream()
                .collect(Collectors.groupingBy(Student::getName));
        System.out.println(nameWithStudents2);


    }
}
