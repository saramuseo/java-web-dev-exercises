package exercises.technology;

public class SmartPhone extends Computer {

    private String password;

    public SmartPhone(String password, double screenSize, double batteryLife, boolean hasTouchScreen, int brightnessLevel, int id) {
        super(screenSize, batteryLife, hasTouchScreen, brightnessLevel, id);
        this.password = password;
    }

    public boolean requirePassword () {
        if(password == "null"){
            return false;
        }
        return true;
    }

    public String getPassword () {
        return password;
    }
}
