public class Product {
    private String store;
    private String productName;
    private double price;
    private String message;
    private int quantity;

    public Product(String store, String productName, double price, String message, int quantity) {
        this.store = store;
        this.productName = productName;
        this.price = price;
        this.message = message;
        this.quantity = quantity;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        String result = String.format("Product: %s\nStore: %s\nPrice: %f", productName, store, price);
        return result;
    }

    public String describe() {
        String result = String.format("Product: %s\nStore: %s\nPrice: %f", productName, store, price);
        result = result + String.format("Description: %s\nQuantity: %d" + message, quantity);
        return result;
    }
}