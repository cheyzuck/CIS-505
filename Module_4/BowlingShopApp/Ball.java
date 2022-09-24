package Module_4.BowlingShopApp;

public class Ball extends Product{
    private String color;

    public Ball(){
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public String toString(){
        return "  Color: "+getColor();
    }
}
