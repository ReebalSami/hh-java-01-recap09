package neuefisched.de;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();

        //creating products
        Product laptop  = new Product("222-1589", "Laptop");
        Product monitor = new Product("856-7589", "monitor");
        Product laptop2 = new Product("222-1590", "laptop2");
        Product lamp    = new Product("586-4285", "lamp");

        //adding products to ProductRepo
        System.out.println("Original lis:");
        System.out.println(productRepo.getAllProducts());

        System.out.println("adding laptop:");
        productRepo.addProduct(laptop);
        System.out.println("The ProductList has now:");
        System.out.println(productRepo.getAllProducts());


        System.out.println("adding monitor:");
        productRepo.addProduct(monitor);
        System.out.println("The ProductList has now:");
        System.out.println(productRepo.getAllProducts());


        System.out.println("adding laptop2:");
        productRepo.addProduct(laptop2);
        System.out.println("The ProductList has now:");
        System.out.println(productRepo.getAllProducts());


        //removing products from ProductRepo

        productRepo.removeProduct(laptop);

        // getting a single product by name

        System.out.println("This Product is: " + productRepo.getProductByName("monitor"));
        //getting all products

        System.out.println("The ProductList after removing laptop:");
        System.out.println(productRepo.getAllProducts());
        System.out.println(productRepo.getAllProducts());


        OrderListRepo orderListRepo = new OrderListRepo();

        // Adding orders

        List<Product> products1 = List.of(laptop, monitor);
        List<Product> products2 = List.of(laptop2, lamp);

                //new Product("9637584", "lamp"), new Product("9637584", "microphone"));

        Order order1 = new Order("9637584", products1);
        Order order2 = new Order("9637585", products2);
        Order order3 = new Order("9637586", products1);

        orderListRepo.addOrder(order1);
        orderListRepo.addOrder(order2);
        orderListRepo.addOrder(order3);

        // Getting a single order by orderId
        Order orderById2 = orderListRepo.getOrderById("9637585");
        System.out.println("Order by ID: " + orderById2);


        // Getting all orders
        List<Order> allOrders = orderListRepo.getAllOrders();
        System.out.println("All Orders: " + allOrders);

    }
}