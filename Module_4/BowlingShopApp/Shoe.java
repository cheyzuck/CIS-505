package Module_4.BowlingShopApp;

public class Shoe extends Product {
    private double size;

    public Shoe(){
    }

    public double getSize(){
        return size;
    }

    public void setSize(double newSize){
        this.size = newSize;
    }

    public String toString(){
        return "  Shoe Size: "+getSize();
    }
}
