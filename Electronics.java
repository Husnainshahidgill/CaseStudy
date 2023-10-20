public class Electronics extends Product {
    private String powerCons;
    private String warranty;

    public Electronics(String id, String name, double price, int stockQuantity, String powerCons, String warranty) {
        super(id, name, price, stockQuantity);
        this.powerCons = powerCons;
        this.warranty = warranty;
    }

    public String getPowerCons() {
        return powerCons;
    }

    public void setPowerCons(String powerCons) {
        this.powerCons = powerCons;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
    @Override
    public void displayDetails(){
        System.out.println("Electronic Product details: ");
        System.out.println("ID: " + getId());
        System.out.println("NAME: " + getName());
        System.out.println("PRICE: " + getPrice());
        System.out.println("STOCK QUANTITY: " + getStockQuantity());
        System.out.println("POWER CONSUMPTION: " + getPowerCons());
        System.out.println("WARRANTY: " + getWarranty());

    }
}
