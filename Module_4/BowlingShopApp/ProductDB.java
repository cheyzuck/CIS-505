package Module_4.BowlingShopApp;

import java.util.*;

public class ProductDB{

    public static GenericQueue<Product> getProducts(String code){
        if (code.equalsIgnoreCase("b"))
        {
            Ball ball1 = new Ball();
            Ball ball2 = new Ball();
            Ball ball3 = new Ball();
            Ball ball4 = new Ball();
            Ball ball5 = new Ball();

            ball1.setCode("B100");
            ball1.setDescription("Black Widow 2.0");
            ball1.setPrice(144.95);
            ball1.setColor("Black and Red");

            ball2.setCode("B200");
            ball2.setDescription("Axiom Pearl");
            ball2.setPrice(154.95);
            ball2.setColor("Blue and Red");

            ball3.setCode("B300");
            ball3.setDescription("Proton Physix");
            ball3.setPrice(174.95);
            ball3.setColor("Pink and Purple");

            ball4.setCode("B400");
            ball4.setDescription("Force Unleashed");
            ball4.setPrice(139.99);
            ball4.setColor("Red and White");

            ball5.setCode("B500");
            ball5.setDescription("Phase III");
            ball5.setPrice(154.99);
            ball5.setColor("Purple and Green");

            GenericQueue<Product> balls = new GenericQueue<Product>();
            balls.enqueue(ball1);
            balls.enqueue(ball2);
            balls.enqueue(ball3);
            balls.enqueue(ball4);
            balls.enqueue(ball5);
            return balls;
        }
        else if (code.equalsIgnoreCase("a"))
        {
            Bag bag1 = new Bag();
            Bag bag2 = new Bag();
            Bag bag3 = new Bag();

            bag1.setCode("A100");
            bag1.setDescription("Path Pro Deluxe");
            bag1.setPrice(34.99);
            bag1.setType("Single");

            bag2.setCode("A200");
            bag2.setDescription("Prime Roller Black/Royal Blue");
            bag2.setPrice(54.99);
            bag2.setType("Double");

            bag3.setCode("A300");
            bag3.setDescription("Silver/Royal Blue");
            bag3.setPrice(74.99);
            bag3.setType("Triple");

            GenericQueue<Product> bags = new GenericQueue<Product>();
            bags.enqueue(bag1);
            bags.enqueue(bag2);
            bags.enqueue(bag3);
            return bags;
        }
        else if (code.equalsIgnoreCase("s"))
        {
            Shoe shoe1 = new Shoe();
            Shoe shoe2 = new Shoe();
            Shoe shoe3 = new Shoe();
            Shoe shoe4 = new Shoe();
            Shoe shoe5 = new Shoe();

            shoe1.setCode("S100");
            shoe1.setDescription("Men's Ram Black");
            shoe1.setPrice(39.99);
            shoe1.setSize(10.5);

            shoe1.setCode("S200");
            shoe1.setDescription("Women's Rise Black/Hot Pink");
            shoe1.setPrice(39.99);
            shoe1.setSize(7.0);

            shoe1.setCode("S300");
            shoe1.setDescription("Women's Path Lite Seamless Mesh");
            shoe1.setPrice(54.99);
            shoe1.setSize(6.0);

            shoe1.setCode("S400");
            shoe1.setDescription("Men's Tribal White");
            shoe1.setPrice(56.99);
            shoe1.setSize(8.5);

            shoe1.setCode("S500");
            shoe1.setDescription("Youth Skull Green/Black");
            shoe1.setPrice(39.99);
            shoe1.setSize(3.0);

            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoes.enqueue(shoe1);
            shoes.enqueue(shoe2);
            shoes.enqueue(shoe3);
            shoes.enqueue(shoe4);
            shoes.enqueue(shoe5);
            return shoes;
        }
        else{
            GenericQueue<Product> empty = new GenericQueue<Product>();
            return empty;
        }
    }
}
