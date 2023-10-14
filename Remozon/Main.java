package Remozon;

class Customer {
    String Cid;
    String Cname;
    String Caddress;
    String Cphone;
    String Cemail;

    Customer(
            String Cid,
            String Cname,
            String Caddress,
            String Cphone,
            String Cemail) {

        this.Cid = Cid;
        this.Cname = Cname;
        this.Caddress = Caddress;
        this.Cphone = Cphone;
        this.Cemail = Cemail;
        System.out.println("Customer Constructed.");
    }

    void View_Product() {
    }

    void Add_to_cart() {
    }

    void Order() {
    }

    void Payment() {
    }

    void Login() {
    }

    void Registration() {
    }

}

class Admin {
    String Aid;
    String Aname;
    String Aaddress;
    String Aphone;
    String Aemail;

    Admin(
            String Aid,
            String Aname,
            String Aaddress,
            String Aphone,
            String Aemail) {
        this.Aid = Aid;
        this.Aname = Aname;
        this.Aaddress = Aaddress;
        this.Aphone = Aphone;
        this.Aemail = Aemail;
        System.out.println("Admin Constructed.");
    }

    void View_product() {
    }

    void Add_product() {
    }

    void Manage_order() {
    }

    void Manage_product() {
    }

    void Login() {
    }
}

class Order {
    String Oid;
    String Ostatus;
    String Odate;

    Order(
            String Oid,
            String Ostatus,
            String Odate) {
        this.Oid = Oid;
        this.Ostatus = Ostatus;
        this.Odate = Odate;
        System.out.println("Order Constructed.");
    }

    void Order_details() {
    }
}

class Product {
    String Pid;
    String Pname;
    String Pprice;

    Product(
            String Pid,
            String Pname,
            String Pprice) {

        this.Pid = Pid;
        this.Pname = Pname;
        this.Pprice = Pprice;
        System.out.println("Product Constructed.");
    }

    void Available_stocks() {
    }

    void Get_product() {
    }

    void Manage_order() {
    }

    void Manage_product() {
    }

    void Login() {
    }

}

class Cart {
    String CartId;

    Cart(String CartId) {
        this.CartId = CartId;
        System.out.println("Cart Constructed.");
    }

    void Delete_cart() {
    }

    void Get_product() {
    }

    void Update_cart() {
    }
}

class Payment {
    double Pamount;
    String Pdate;
    long Pnum;

    Payment(
            double Pamount,
            String Pdate,
            long Pnum) {
        this.Pamount = Pamount;
        this.Pdate = Pdate;
        this.Pnum = Pnum;
        System.out.println("Payment Constructed.");
    }

    void Payment_details() {
    }

}

public class Main {

}
