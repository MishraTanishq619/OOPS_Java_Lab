
class Animal {
    int legs;

    Animal(int l) {
        this.legs = l;
    }

    void walk() {
        System.out.println("Animal is Walking.");
    }

    void eat() {
        System.out.println("Animal is Eating.");
    }

}

interface Pet {
    String getName();

    void setName(String name);

    void play();
}

class Spider extends Animal {
    Spider() {
        super(8);
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println("OOh it is Spider.");
    }
}

class Cat extends Animal implements Pet {
    String name = null;

    Cat(String name) {
        super(4);
        this.name = name;
    }

    Cat() {
        super(4);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Cat is Playing.");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println("Cat is eating.");
    }
}

class Fish extends Animal implements Pet {
    String name = null;

    Fish() {
        super(0);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Fish is playing.");
    }

    @Override
    void walk() {
        // TODO Auto-generated method stub
        super.walk();
        System.out.println("Fish is walking.");
    }

    @Override
    void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println("Fish is eating.");
    }
}

public class Main_Animals_2 {

    public static void main(String[] args) {

        Spider S1 = new Spider();
        S1.eat();

        Cat C1 = new Cat();
        C1.play();

        Cat C2 = new Cat("Kitten");
        C2.play();

        Fish F1 = new Fish();
        F1.walk();

    }

}