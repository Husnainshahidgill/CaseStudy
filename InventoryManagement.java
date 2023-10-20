public class InventoryManagement {
    private Product products [];
    private int prodCount;

    public InventoryManagement(int maxsize) {
        this.products = new Product[maxsize];
        this.prodCount = 0;
    }

    //METHODS

    public void addProduct(Product product){
        if (prodCount < products.length){
            products[prodCount++] = product;
            System.out.println("Product Added.");
        } else {
            //System.out.println("Product Catalog is full!");
            throw new ProductExceptionNotFound("Product Catalog is full.");
        }
    }

    public void updateProductPrice(String productId, double updPrice){
        for (int i=0 ; i<products.length ; i++){
            if (products[i]!=null && products[i].getId() == productId){
                products[i].setPrice(updPrice);
                System.out.println("Details updated.");
                return;
            }
            }
        System.out.println("Details updated.");

    }

    public void updateProductStock(String productId, int updQuan) {
        for (int i = 0; i < products.length; i++) {
            if (products[i]!=null && products[i].getId() == productId) {
                products[i].setStockQuantity(updQuan);
                System.out.println("Details updated.");
                return;
            }
            }
        System.out.println("Product is not available!");

    }

    public void deleteProd(String productId, Product product){
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == productId){
                products[i] = null;
                prodCount--;
                found = true;
                System.out.println("Product Deleted.");
                break;
            }
            }
        if (found != true){
            System.out.println("Product is not available or already deleted.");
        }
    }


    public void getProductbyId(String productId){
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == productId)
            {
                products[i].displayDetails();
                found = true;
                break;


            }
            }
        }


    public void getProduct(String productName){
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName() == productName){
                products[i].displayDetails();
                found = true;
                break;
            }
        }
    }
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }




}
