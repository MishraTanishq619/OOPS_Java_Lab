class Animals {
    int legs;

    Animals(int legs) {
        this.legs = legs;
    }

    String walk() {
        return "Walk";
    }
}

class cats extends Animals {
    String name;

    cats(int legs, String name) {
        super(legs);
        this.name = name;
    }

    void show() {
        System.out.println("Cat , legs = " + legs + " , breed = " + breed + " , Sound = " + sound);
    }
}

class Main_animals {

    public static void main(String[] args) {
        Spider s1 = new Spider();
        Cat c1 = new Cat();
        Fish f1 = new Fish();

    }
}
