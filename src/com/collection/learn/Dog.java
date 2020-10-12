package com.collection.learn;

class Dog implements Comparable<Dog> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Doglist [name=" + name + ", age=" + age + "]";
    }

   @Override
    public int compareTo(Dog dog) {
        return this.age - dog.age;

    }
}


