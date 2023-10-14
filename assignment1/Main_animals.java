// Q.15

class Animals {
    int legs;

    Animals(int legs) {
        this.legs = legs;
        System.out.println("Animal Constructed.");

    }

    void walk() {
        System.out.println("Walking.");
    }

    void eat() {
        System.out.println("Eating.");
    }
}

interface Pets {
    String getName();

    void setName(String name);

    void play();

}

class Cat extends Animals implements Pets {
    String name;

    Cat(String name) {
        super(4);
        this.name = name;
        System.out.println("Cat Constructed.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing.");
    }

    // eat()

    void show() {
        System.out.println("Cat , legs = " + legs + " , Name : " + name);
    }
}

class Fish extends Animals implements Pets {
    String name;

    Fish(String name) {
        super(0);
        this.name = name;
        System.out.println("Fish Constructed.");

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing.");
    }

    // eat()

    void show() {
        System.out.println("Fish , legs = " + legs + " , Name : " + name);
    }
}

class Spider extends Animals {
    Spider() {
        super(8);
        System.out.println("Spider Constructed.");
    }

    // eat()
}

class Main_animals {

    public static void main(String[] args) {
        Spider s1 = new Spider();
        Cat c1 = new Cat("Kitty");
        Fish f1 = new Fish("Goldu");

        s1.eat();
        System.out.println("Cat name is : " + c1.getName());
        f1.walk();
    }
}
