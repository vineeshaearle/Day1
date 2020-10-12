package com.collection.learn;

class Cat implements Comparable<Cat> {

    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Catlist [name=" + name + ", age=" + age + "]";

    }
    @Override
    public int compareTo(Cat cat) {
        return this.age - cat.age;
    }
}

