// Q.13

class Employee {
    String Name;
    String Emp_id;
    int Salary;

    Employee(
            String Name,
            String Emp_id,
            int Salary) {
        this.Name = Name;
        this.Emp_id = Emp_id;
        this.Salary = Salary;
        System.out.println("Constructor called.");
    }

    void Show() {
        System.out.println("Name is : " + Name + " , Employuee id is : " + Emp_id + " , Salary is : " + Salary);
    }

    void raise(int n) {
        this.Salary += n;
        System.out.println(n + " Rupees raised.");
    }
}

class Main_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Harry Potter", "007", 12000);
        Employee e2 = new Employee("Harry Styles", "619", 78931);

        e1.Show();
        e2.Show();
    }
}
