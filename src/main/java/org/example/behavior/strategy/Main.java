package org.example.behavior.strategy;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Test", 176,75,33);
        Human h2 = new Human("Test2", 182,66,31);

        MyClass ageClass = new MyClass(new AgeComparator());
        MyClass heightClass = new MyClass(new HeightComparator());

        System.out.println(ageClass.compare(h1, h2));
        System.out.println(heightClass.compare(h1,h2));
    }
}
