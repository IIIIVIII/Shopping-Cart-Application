import java.util.ArrayList;
public class Shoppingcart {
    private ArrayList<Product>inTheCart = new ArrayList<>();
    Product product;

    {
        product = new Product(0);
    }

    public Shoppingcart(Product product){
        this.product = product;
    }
    public ArrayList<Product> getCart (ArrayList<Product>inTheCart){
        return inTheCart;
    }
    public ArrayList<Product> setCart(ArrayList<Product>inTheCart){
        this.inTheCart = inTheCart;
        return inTheCart;
    }
    public void Checknow(){

    }
    public void Checklater(){

    }

}
