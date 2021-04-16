
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory catalogue;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.addToWarehouse(initialBalance);
        this.catalogue = new ChangeHistory();
        this.catalogue.add(initialBalance);
    }
    
    public String history() {
        return this.catalogue.toString();
    }
}
