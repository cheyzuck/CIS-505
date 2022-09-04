public class TestFanApp{
    public static void Main(String[] args){

        Fan myFan_01 = new Fan();

        myFan_01.setSpeed(2);
        myFan_01.setPower(true);
        myFan_01.setRadius(7);
        myFan_01.setColor("pink");
        System.out.println(myFan_01.toString());

        Fan myFan_02 = new Fan(); 
        myFan_02.getSpeed();
        myFan_02.getPower();
        myFan_02.getRadius();
        myFan_02.getColor();
        System.out.println(myFan_02.toString());
    }
}