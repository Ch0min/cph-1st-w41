import java.util.ArrayList;

public class Dog extends Owner {
    boolean isHungry = true;
    String dogName;
    private Owner owner;

    private ArrayList<Dog> offSpring;

    //Constructor
    public Dog(String dogName, boolean isHungry) {
        this.dogName = dogName;
        this.isHungry = isHungry;

        offSpring = new ArrayList<Dog>();
        for(int i = 0; i < offSpring.size(); i++) {
            System.out.println(offSpring.get(i));

        }

    }

    public String getDogName() {
        return dogName;
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(ArrayList<Dog> offSpring) {
        this.offSpring = offSpring;
    }

    public void feedDog() {
        int energy = 100;
        if (energy < 50) {
            isHungry = true;
        } else if (energy > 50) {
            isHungry = false;
        }
        System.out.println("Dog is fed");
    }
}


