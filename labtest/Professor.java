package labtest;

public class Professor extends Library {
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

        System.out.println(this.Name + "  " +
                this.Branch + "  " +
                this.Emp_id);

        System.out.println(
                super.Book_name + "  " +
                        super.Author + "  " +
                        super.Publish_year + "  " +
                        super.No_of_copies);

    }
}
