class OPJUBuilding {
    int length;
    int width;

    OPJUBuilding(int a, int b) {
        this.length = a;
        this.width = b;
    }

    int area() {
        return length * width;

    }

}

class Classroom extends OPJUBuilding {
    // int length;
    // int width;
    int depth;

    Classroom(int x, int y, int depth) {
        super(x, y);
        this.depth = depth;
    }

    int volume() {
        return super.length * super.width * depth;
    }

    public static void main(String[] args) {
        // OPJUBuilding op = new OPJUBuilding(15, 20);

        // System.out.println(op.area());

        Classroom cl = new Classroom(20, 10, 30);

        System.out.println(cl.area());
    }

}
