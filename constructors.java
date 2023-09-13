/**
 * Student
 */
class Student {

    String Name;

    // Default constructor - default values
    Student() {
        this.Name = "Unknown";
    }

    // Parameterised Constructor - user defined values
    Student(String name) {
        this.Name = name;
    }

    // copy constructor
    Student(Student S) {
        this.Name = S.Name;
    }

}

/**
 * Employee
 */
class Employee {
    String Name;
    String EmpId;
    String dept;
    int salary;
    String post;
    String Shift;
    int mobile;
    String adress;
    String gender;
    String religiion;
    String country;

    Employee() {
        this.Name = "Shobhit";
        this.EmpId = "E007";
        this.dept = "CSE";
        this.salary = 120000;
        this.post = "Manager";
        this.Shift = "Morning";
        this.mobile = 890357698;
        this.adress = "OPJU";
        this.gender = "Male";
        this.religiion = "Hindi";
        this.country = "India";
    }

    Employee(String Name,
            String EmpId,
            String dept,
            int salary,
            String country) {
        this.Name = Name;
        this.EmpId = EmpId;
        this.dept = dept;
        this.salary = salary;
        this.country = country;
    }

    Employee(String Name,
            String EmpId,
            String Shift,
            int mobile,
            String adress,
            String gender,
            String religiion) {
        this.Name = Name;
        this.EmpId = EmpId;
        this.Shift = Shift;
        this.adress = adress;
        this.gender = gender;
        this.religiion = religiion;
    }

    Employee(Employee E) {

    }

}

class constructors {

    // public static void main(String[] args) {
    // Student st = new Student();
    // Student st2 = new Student("Shobhit");
    // Student st3 = new Student(st2);

    // System.out.println("Name by st is : " + st.Name);
    // System.out.println("Name by st2 is : " + st2.Name);
    // System.out.println("Name by st3 is : " + st3.Name);

    // }

    public static void main(String[] args) {
        Employee E1 = new Employee();

        System.out.println(" \n Name = " + E1.Name +
                " \n EmpId = " + E1.EmpId +
                " \n dept = " + E1.dept +
                " \n salary = " + E1.salary +
                " \n post = " + E1.post +
                " \n Shift = " + E1.Shift +
                " \n mobile = " + E1.mobile +
                " \n adress = " + E1.adress +
                " \n gender = " + E1.gender +
                " \n religiion = " + E1.religiion +
                " \n country = " + E1.country +
                " \n");
    }
}
