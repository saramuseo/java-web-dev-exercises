package exercises.technology;

public class Laptop extends Computer{
     private boolean hasNumberKeypad;

     public Laptop (boolean hasNumberKeypad, double screenSize, double batteryLife, boolean hasTouchScreen, int brightnessLevel, int id) {
          super(screenSize, batteryLife, hasTouchScreen, brightnessLevel, id);
          this.hasNumberKeypad = hasNumberKeypad;
     }

     public boolean numbers () {
          if (hasNumberKeypad) {
               return true;
          }
          return false;
     }

     public boolean getHasNumberKeyPad () {
          return hasNumberKeypad;
     }
}
