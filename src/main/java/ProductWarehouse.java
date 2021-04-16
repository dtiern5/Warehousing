
public class ProductWarehouse extends Warehouse {
    private String product;
    
    public ProductWarehouse(String product, double capacity) {
        super(capacity);
        this.product = product;
    }
    
    public void setName(String newName) {
        this.product = newName;
    }
    
    public String getName() {
        return product;
    }
    
    @Override
    public String toString() {
        return getName() + ": " + super.toString();
    }
}
