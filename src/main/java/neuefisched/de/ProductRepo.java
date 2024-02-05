package neuefisched.de;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<Product> productList = new ArrayList<>();

    //getter & setter


    public ProductRepo() {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }

    // Method to add a product
    public void addProduct(Product product){
        productList.add(product);
    }
    // Method to remove a product
    public void removeProduct(Product product){
        productList.remove(product);
    }

    public Product getProductByName(String name){
        for (Product product : productList){
            if ( product.name().equals(name)){
                return product;
            }
        }
        //System.out.println("This Product does not exists");
        return null;
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(productList);
    }
}





