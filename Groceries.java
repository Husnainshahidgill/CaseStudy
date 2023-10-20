public class Groceries extends Product {
    private String expDate;
    private String nutVal;

    public Groceries(String id, String name, double price, int stockQuantity, String expDate, String nutVal) {
        super(id, name, price, stockQuantity);
        this.expDate = expDate;
        this.nutVal = nutVal;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getNutVal() {
        return nutVal;
    }

    public void setNutVal(String nutVal) {
        this.nutVal = nutVal;
    }
    @Override
    public void displayDetails() {
        System.out.println("Groceries Product Details: ");
        System.out.println("ID: " + getId());
        System.out.println("NAME: " + getName());
        System.out.println("PRICE: " + getPrice());
        System.out.println("STOCK QUANTITY: " + getStockQuantity());
        System.out.println("EXPIRATION DATE: " + getExpDate());
        System.out.println("NUTRITIONAL VALUE: " + getNutVal());
    }

}
