package Module_4.BowlingShopApp;

import java.util.*;

public class ProductDB {

    public static Product getProducts(String code){
        if (code.equalsIgnoreCase("b")){
            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setDescription("Black Widow 2.0");
            ball1.setPrice(144.95);
            ball1.setColor("Black and Red");

            GenericQueue<Product> balls = new GenericQueue<Product>();
            balls.enqueue(ball1);
        }
        else if (code.equalsIgnoreCase("s")){
            Bag bag1 = new Bag();
            bag1.setCode("A100");
            bag1.setDescription("");
            bag1.setPrice(74.99);
            bag1.setType("2");

            GenericQueue<Product> bags = new GenericQueue<Product>();
            bags.enqueue(bag1);
        }
        else if (code.equalsIgnoreCase("a")){
            Shoe shoe1 = new Shoe();
            shoe1.setCode("S100");
            shoe1.setDescription("");
            shoe1.setPrice(59.95);
            shoe1.setSize(7);
            
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoes.enqueue(shoe1);
        }
        else{
            Product product1 = new Product();

            GenericQueue<Product> products = new GenericQueue<Product>();
            products.enqueue(product1);

        }
        
    }
    
}
