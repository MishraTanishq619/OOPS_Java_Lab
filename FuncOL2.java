public class FuncOL2 {

    void getData(String name, String Dept, String empId) {
        System.out.println("Name = " + name);
        System.out.println("Name = " + Dept);
        System.out.println("Name = " + empId);
    }

    void getData(String name, int Roll, int Sem) {
        System.out.println("Name = " + name);
        System.out.println("Name = " + Roll);
        System.out.println("Name = " + Sem);
    }

    void getData(String name, String empId, int Salary) {
        System.out.println("Name = " + name);
        System.out.println("Name = " + empId);
        System.out.println("Name = " + Salary);
    }

    void getData(String name, double empId, int Salary) {
        System.out.println("Name = " + name);
        System.out.println("Name = " + empId);
        System.out.println("Name = " + Salary);
    }

    public static void main(String[] args) {
        FuncOL2 ob = new FuncOL2();
        ob.getData("name", "cse", "E001");
        System.out.println();
        ob.getData("name", 0024, 3);
        System.out.println();
        ob.getData("name", "E007", 30000);
        System.out.println();
        ob.getData("name", 707.323, 30000);
        System.out.println();
    }
}
