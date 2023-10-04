// package labtest;

class Library {
    String Book_name;
    String Author;
    int Publish_year;
    int No_of_copies;

    Library(
            String bn,
            String ath,
            int py,
            int noc) {
        this.Book_name = bn;
        this.Author = ath;
        this.Publish_year = py;
        this.No_of_copies = noc;
    }
}

class Student extends Library {
    String Name;
    int Roll;
    int Sem;
    String Branch;

    Student(
            String nm,
            int rl,
            int sem,
            String br,

            String bn2,
            String ath2,
            int py2,
            int noc2) {

        super(bn2, ath2, py2, noc2);
        this.Name = nm;
        this.Roll = rl;
        this.Sem = sem;
        this.Branch = br;
    }

    void show() {
        System.out.println(
                "Student Name : " + this.Name + "  |   " +
                        "Student Roll : " + this.Roll + "  |   " +
                        "Student Sem : " + this.Sem + "  |   " +
                        "Student Branch : " + this.Branch);

        System.out.println(
                "Book Name : " + super.Book_name + "  |   " +
                        "Book Author : " + super.Author + "  |   " +
                        "Book Publish_Year : " + super.Publish_year + "  |   " +
                        "Book No_of_Copies : " + super.No_of_copies);
    }
}

class Professor extends Library {
    String Name;
    String Branch;
    int Emp_id;

    Professor(
            String nm,
            String br,
            int eid,

            String bn2,
            String ath2,
            int py2,
            int noc2) {

        super(bn2, ath2, py2, noc2);
        this.Name = nm;
        this.Branch = br;
        this.Emp_id = eid;
    }

    void show() {

        System.out.println("Professor Name : " + this.Name + "  |   " +
                "Professor Branch : " + this.Branch + "  |   " +
                "Professor EID : " + this.Emp_id);

        System.out.println(
                "Book Name : " + super.Book_name + "  |   " +
                        "Book Author : " + super.Author + "  |   " +
                        "Book Publish_Year : " + super.Publish_year + "  |   " +
                        "Book No_of_Copies : " + super.No_of_copies);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Student1", 21, 3, "CSE", "St Book1", "JK Rowlings", 1992, 20000);
        Professor p1 = new Professor("Professor1", "CSE", 101, "Pr Book1", "Manish Pandey", 2020, 4000);

        s1.show();
        System.out.println();
        p1.show();
    }

}
