package labtest;

public class Library {
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
