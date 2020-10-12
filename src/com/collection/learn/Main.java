package com.collection.learn;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Lab");
        dog1.setAge(3);

        Dog dog2 = new Dog();
        dog2.setName("Beagle");
        dog2.setAge(1);

        Dog dog3 = new Dog();
        dog3.setName("Golden");
        dog3.setAge(6);

        Dog dog4 = new Dog();
        dog4.setName("German");
        dog4.setAge(4);

        Dog dog5 = new Dog();
        dog5.setName("Husky");
        dog5.setAge(2);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);
        Collections.sort(dogList);
        System.out.println(dogList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("cat1", 2));
        catList.add(new Cat("cat2", 6));
        catList.add(new Cat("cat3", 7));
        catList.add(new Cat("cat4", 5));
        catList.add(new Cat("cat5", 3));
        Collections.sort(catList);
        System.out.println(catList);

        Map<Integer, Integer> ageMap = new HashMap<>();
        Iterator<Cat> itCat = catList.iterator();
        Iterator<Dog> itDog = dogList.iterator();
        while (itCat.hasNext() && itDog.hasNext()) {
            ageMap.put(itCat.next().getAge(), itDog.next().getAge());
        }
        System.out.println("Final pairs"+ageMap);

    }
}