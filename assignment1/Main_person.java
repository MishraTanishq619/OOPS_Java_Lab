// Q.14 

class Person {
    String name;
    String date;
    String sex;

    Person(
            String name,
            String date,
            String sex) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        System.out.println("Person Constructed.");
    }

    String getName() {
        return this.name;
    }

    String getDate() {
        return this.date;
    }

    String getSex() {
        return this.sex;
    }
}

interface StudentInterface {

    String getAddress();

    String getDepartment();
}

class Student extends Person implements StudentInterface {
    String address;
    String department;

    Student(String name,
            String date,
            String sex,
            String address,
            String department) {
        super(name, date, sex);
        this.address = address;
        this.department = department;
        System.out.println("Student Constructed.");
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getDepartment() {
        return this.department;
    }
}

interface TeacherInterface {

    String getRank();

    String getDepartment();

    String getCourse();
}

class Teacher extends Person implements TeacherInterface {
    String rank;
    String department;
    String course;

    Teacher(String name,
            String date,
            String sex,
            String rank,
            String department,
            String course) {
        super(name, date, sex);
        this.rank = rank;
        this.department = department;
        this.course = course;
        System.out.println("Teacher Constructed.");
    }

    @Override
    public String getRank() {
        return this.rank;
    }

    @Override
    public String getDepartment() {
        return this.department;
    }

    @Override
    public String getCourse() {
        return this.course;
    }
}

class GradTeachingFellow extends Person implements StudentInterface, TeacherInterface {

    String supervisor;
    String address;
    String department;
    String rank;
    String course;

    GradTeachingFellow(
            String name,
            String date,
            String sex,
            //
            String supervisor,
            String address,
            String department,
            String rank,
            String course) {
        super(name, date, sex);
        this.supervisor = supervisor;
        this.address = address;
        this.department = department;
        this.rank = rank;
        this.course = course;
        System.out.println("Fellow Constructed.");
    }

    String getSupervisor() {
        return this.supervisor;
    }

    // Student

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getDepartment() {
        return this.department;
    }

    // Teacher

    @Override
    public String getRank() {
        return this.rank;
    }

    @Override
    public String getCourse() {
        return this.course;
    }
}

/**
 * Main_person
 */
public class Main_person {
    public static void main(String[] args) {
        Person p1 = new Person("Larry", "12/3/12", "Male");
        Student s1 = new Student("Piccolo", "4/5/6", "Male", "Raigarh", "CSE");
        Teacher t1 = new Teacher("Goku", "30/5/10", "Male", "HOD", "CSE", "B.Tech");

        GradTeachingFellow g1 = new GradTeachingFellow("GradName", "12/02/00", "Male", "GradSupervisor", "Raigarh",
                "CSE", "Fellow1", "PHD");

        System.out.println(p1.getName());
        System.out.println(s1.getName() + "  " + s1.getAddress());
        System.out.println(t1.getName() + "  " + t1.getRank());

        System.out.println(g1.getName() + "  " + g1.getSupervisor());

    }
}