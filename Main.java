class Main {
    public static void main(String[] args) {
        ProductItm p1 = new ProductItm(11, 120.5F);
        ProductItm p2 = new ProductItm(12, 140.7F);
        ProductItm p3 = new ProductItm(13, 170.3F);
        ProductItm p4 = new ProductItm(14, 190.1F);

        ShoppingCart C1 = new ShoppingCart(901);

        C1.addItem(p1);
        C1.addItem(p2);
        C1.addItem(p3);
        C1.addItem(p4);

        C1.show();
    }

}
