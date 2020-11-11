package models;

public class Fruit {
    // private field
    private String name;

    // constructor
    public Fruit(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // class method
    public void Wave() {
        System.out.println("Look " + this.name + " is waving at us.");
    }
}
