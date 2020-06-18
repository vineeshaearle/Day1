package com.vineesha.learn;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Do not modify from here --->>
        Map<String, List<Student>> schoolData = new HashMap<>();

        // class 1 data
        List<Student> studentList = new ArrayList<>();

        Student student = new Student();
        student.setName("ram");
        student.setAge(12);

        studentList.add(student);

        student = new Student();
        student.setName("bheem");
        student.setAge(11);

        studentList.add(student);

        schoolData.putIfAbsent("class1", studentList);

        System.out.println("Class1" + studentList);
        // class 2 data
        List<Student> studentList2 = new ArrayList<>();

        Student student2 = new Student();
        student2.setName("jessica");
        student2.setAge(12);

        studentList2.add(student2);

        student2 = new Student();
        student2.setName("katrina");
        student2.setAge(11);

        studentList2.add(student2);

        schoolData.putIfAbsent("class2", studentList2);
        System.out.println("Class2" + studentList2);

        Map<String, Integer> studentWeightData = new HashMap<>();
        studentWeightData.putIfAbsent("ram", 32);
        studentWeightData.putIfAbsent("bheem", 48);
        studentWeightData.putIfAbsent("jessica", 26);
        studentWeightData.putIfAbsent("katrina", 24);

        // <<--- Do not modify till here

        // Code from below ------>>>
//                for(Map.Entry<String, Integer> m:studentWeightData.entrySet() ){
//            String key=m.getKey();
//            Integer s= m.getValue();
//                    System.out.println("Student name " + key + "\n"+
//                   " Weight is: " + s);
//        }
        for (Map.Entry<String, List<Student>> entries : schoolData.entrySet()) {
            List<Student> students = entries.getValue();
            System.out.println("Students:" + students);
            for (Student studentTemp : students) {
                String studentName = studentTemp.getName();
                Integer studentWeight = studentWeightData.get(studentName);

                if (studentWeight != null) {
                    studentTemp.setWeight(studentWeight);
                }
                System.out.println("Student name " + studentName + "\n" +
                        " Weight is: " + studentWeight);


            }
        }
    }
}


