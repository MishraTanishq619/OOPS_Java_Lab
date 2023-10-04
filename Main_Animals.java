class Animals {
    int legs;
    String breed;
    String sound;

    Animals() {
        legs = 4;
    }

    void show0() {
        System.out.println("Animal , legs = " + legs);
    }
}

class cats extends Animals {

    cats(String br, String sd) {
        this.breed = br;
        this.sound = sd;
    }

    void show() {
        System.out.println("Cat , legs = " + legs + " , breed = " + breed + " , Sound = " + sound);
    }
}

class dogs extends Animals {
    dogs(String br, String sd) {
        this.breed = br;
        this.sound = sd;
    }

    void show() {
        System.out.println("Dogs , legs = " + legs + " , breed = " + breed + " , Sound = " + sound);
    }
}

class Main_Animals {
    public static void main(String[] args) {

        Animals a1 = new Animals();
        cats c1 = new cats("black", "Meaw");
        dogs d1 = new dogs("German", "Bark");

        a1.show0();
        c1.show();
        c1.show0();
        d1.show();
        d1.show0();
    }
}