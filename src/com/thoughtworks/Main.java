package com.thoughtworks;

class Person {

    private String name;
    private Brain brain;
//    public Person() {
//       System.out.println("This is a constructor");
//    }
//
    public Person(String name) {
        this.name = name;
        brain = new Brain();
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void writeName()
    {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person obj = new Person("Neelima");
        String name = obj.getName();
        obj.setName(name+" Vallamkonda");
        System.out.println(obj.getName());
    }
}

class Brain{
    public Brain()
    {
        System.out.println("Brain is thinking");
    }
}