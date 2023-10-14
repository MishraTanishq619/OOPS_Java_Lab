
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

interface GradTeachingFellow {
    String getTeachingFellow();
}

class Student extends Person {
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

    String getAddress() {
        return this.address;
    }

    String getDepartment() {
        return this.department;
    }
}

class Teacher extends Person {
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

    String getRank() {
        return this.rank;
    }

    String getDepartment() {
        return this.department;
    }

    String getCourse() {
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

        System.out.println(p1.getName());
        System.out.println(s1.getName() + "  " + s1.getAddress());
        System.out.println(t1.getName() + "  " + t1.getRank());
    }
}