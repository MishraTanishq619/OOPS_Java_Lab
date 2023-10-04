package MovieDetails;

public class Directors {
    String Name;
    String Address;
    long Mobile;

    Directors(String nm,
            String ad,
            long mob) {
        this.Name = nm;
        this.Address = ad;
        this.Mobile = mob;
    }

    void show() {
        System.out.println("Name is : " + this.Name);
        System.out.println("Address is : " + this.Address);
        System.out.println("Mobile is : " + this.Mobile + "\n");
    }
}
