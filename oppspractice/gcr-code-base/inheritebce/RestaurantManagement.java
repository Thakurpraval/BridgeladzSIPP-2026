class Person {

    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}

interface Worker {

    void performDuties();
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is preparing delicious food.");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers.");
    }
}

public class RestaurantManagement {

    public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 101);

        Waiter waiter = new Waiter("Amit", 201);

        System.out.println("Chef Details");

        chef.displayPerson();

        chef.performDuties();

        System.out.println();

        System.out.println("Waiter Details");

        waiter.displayPerson();

        waiter.performDuties();
    }
}