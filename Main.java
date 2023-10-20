import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        InventoryManagement inventoryManagement01 = new InventoryManagement(10);

        Product p1 = new Electronics("1","Smartphone",1000.00,15,"75W","2y");
        Product p2 = new Electronics("2","Laptop",1500.00,17,"200W","5y");

        Product p3 = new Furniture("3","Sofa",56000.00,3,"Leather","154cm x 84cm");
        Product p4 = new Furniture("4","Chair",15000.00,3,"Wood","154cm x 84cm");

        Product p5 = new Groceries("5","Bread",120.00,11,"12/10/2024","70 Calories");
        Product p6 = new Groceries("6","Chicken Breast",540.00,8,"06/08/2024","120 Calories");

        inventoryManagement01.addProduct(p1);
        inventoryManagement01.addProduct(p2);
        inventoryManagement01.addProduct(p3);
        inventoryManagement01.addProduct(p4);
        inventoryManagement01.addProduct(p5);
        inventoryManagement01.addProduct(p6);

        //inventoryManagement01.getProductbyId("1");

       // inventoryManagement01.updateProductPrice("1",900.00);
       // inventoryManagement01.getProductbyId("1");



        inventoryManagement01.deleteProd("1",p1);
        //inventoryManagement01.updateProductStock("1",30);
        //inventoryManagement01.getProductbyId("1");

        inventoryManagement01.updateProductPrice("1",900.00);
        inventoryManagement01.getProductbyId("1");
        p1.displayDetails();




    }

}
