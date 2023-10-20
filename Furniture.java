public class Furniture extends Product {
    private String material;
    private String dimension;

    public Furniture(String id, String name, double price, int stockQuantity, String material, String dimension) {
        super(id, name, price, stockQuantity);
        this.material = material;
        this.dimension = dimension;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    @Override
    public void displayDetails(){
        System.out.println("Furniture Product Details: ");
        System.out.println("ID: " + getId());
        System.out.println("NAME: " + getName());
        System.out.println("PRICE: " + getPrice());
        System.out.println("STOCK QUANTITY: " + getStockQuantity());
        System.out.println("MATERIAL: " + getMaterial());
        System.out.println("DIMENSION: " + getDimension());

    }
}

