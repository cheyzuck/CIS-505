package Module_4.BowlingShopApp;

public class Bag extends Product {
    private String type;

    public Bag(){
    }

    public String getType(){
        return type;
    }

    public void setType(String newType){
        this.type = newType;
    }

    public String toString(){
        return "\n  Type: "+getType();
    }
}
