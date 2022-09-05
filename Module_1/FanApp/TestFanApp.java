public class TestFanApp{

    public static void main(String[] args){

        Fan Fan01 = new Fan(2, true, 7, "pink");
        Fan01.setColor("pink");
        Fan01.turnOn();
        Fan01.setRadius(7);
        Fan01.setSpeed(2);
        System.out.println(Fan01.toString());
    
        Fan Fan02 = new Fan();
        Fan02.getColor();
        Fan02.isOn();
        Fan02.getRadius();
        Fan02.getSpeed();
        System.out.println(Fan02.toString());
    }
}
