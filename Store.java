import java.util.ArrayList;
public class Store {
    String storeName;
    ArrayList<Product> products;
    private static double revenue;
    private int purchased;

    private String owner;
    public Store(String owner, String storeName, ArrayList<Product> products) {
        this.owner = owner;
        this.storeName = storeName;
        this.products = products;
        revenue = 0;
        purchased = 0;
    }


    public String getOwner() { return owner; }
    public double getRevenue() { return revenue; }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getPurchased() { return purchased; }

    public void setPurchased(int purchased) {
        this.purchased = purchased;
    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }



}