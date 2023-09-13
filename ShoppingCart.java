import java.util.Vector;

class ShoppingCart {
    int custId;
    Vector<ProductItm> itemList;

    ShoppingCart(int cid) {
        this.custId = cid;
        this.itemList = new Vector<ProductItm>();
    }

    void addItem(ProductItm P) {
        itemList.addElement(P);
    }

    void removeElement(ProductItm P) {
        itemList.removeElement(P);
    }

    void show() {
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i).price);
        }
    }
}
