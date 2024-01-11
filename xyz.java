// Person class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayPersonInfo() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}


class Car {
    String model;
    String color;

    // Constructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Method to display information about the car
    public void displayCarInfo() {
        System.out.println("Car: " + color + " " + model);
    }
}

