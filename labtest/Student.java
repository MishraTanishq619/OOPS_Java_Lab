package labtest;

public class Student extends Library {
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
                this.Name + "  " +
                        this.Roll + "  " +
                        this.Sem + "  " +
                        this.Branch);

        // System.out.println(
        // Book_name + " " +
        // Author + " " +
        // Publish_year + " " +
        // No_of_copies);
    }
}
