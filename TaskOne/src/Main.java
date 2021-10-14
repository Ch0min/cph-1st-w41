import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        Dog myDog2 = new Dog("fido", true);
        Dog puppy1 = new Dog("hej", true);
        Dog puppy2 = new Dog("hejsa", true);


        // sæt en ejer
        myDog.setOwner("Henning");
        myDog2.setOwner("Mark");

        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.setOffSpring(puppy1);
        myDog.setOffSpring(puppy2);

        // print alle hvalpe
        ArrayList<Dog> myOff = myDog.getOffSpring();
        for (Dog myD: myOff) {
            System.out.println("Hvalpenes navne: "+myD);
        }

        // print ejeren
        System.out.println("hunden " + myDog.getDogName() + " er ejet af " + myDog.getOwner());
        System.out.println("hunden " + myDog2.getDogName() + " er ejet af " + myDog2.getOwner());


        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        //String reString = Dog.feedDog();
       // System.out.println(reString);
    }

}
