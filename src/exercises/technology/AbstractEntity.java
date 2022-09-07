package exercises.technology;

public abstract class AbstractEntity {
     int id;

     public AbstractEntity (int id) {
         this.id = id;
     }

     public int createNewID () {
        return this.id +=1;
     }

}
