package exercises.technology;

public class Computer extends AbstractEntity {
    private double screenSize;
    private double batteryLife;
    private boolean hasTouchScreen;

    private int brightnessLevel;

    public Computer (double screenSize, double batteryLife, boolean hasTouchScreen, int brightnessLevel, int id) {
      super (id);
       this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        this.hasTouchScreen = hasTouchScreen;
        this.brightnessLevel = brightnessLevel;
    }

    public void increaseBrightnessLevel (){
        this.brightnessLevel +=1;
    }

    public String makeNoise () {
        return "you've got mail";
    }

    public int getBrightnessLevel(){
        return brightnessLevel;
    }

    public double getBatteryLife () {
        return batteryLife;
    }
//
//    private double getScreenSize (){ return screenSize;}
//
//    public void setScreenSize(double screenSize) {
//        this.screenSize = screenSize;
//    }

}
