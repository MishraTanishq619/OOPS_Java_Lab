/**
 * FuncOL
 */
class FuncOL {

    double area(double a, double b) {
        // System.out.println("Area is : " + (a * b));
        // a = a / 1
        return a * b;
    }
    
    int area(int a, int b) {
        return a * b;
        // rectangle
    }

    int area(int a) {
        return a * a;
        // square
    }

    double area(double a) {
        return a*a*3.14;
        // triangle
    }




    public static void main(String[] args) {
        FuncOL ol = new FuncOL();
        // int a1 =  ol.area(12, 5); 

        // double a2 = ol.area(5); 


        // System.out.println(a1+" and "+a2);

        System.out.println("ans : "+ ol.area(5.4 , 3.12));

    }
    
}