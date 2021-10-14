import java.util.ArrayList;
import java.util.Arrays;

public class Main {

/*




7) lav en metode der kan printe navnene på en hund's hvalpe.
*/

    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        Dog myDog2 = new Dog("fido", true);
        // sæt en ejer
        myDog.setOwner("Henning");
        myDog2.setOwner("Mark");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe


        myDog.getOffSpring().add("woodiessnoopie");
        myDog.getOffSpring().add("woodiesfido");
        myDog2.getOffSpring().add("fidosperle");
        myDog2.getOffSpring().add("fidosfigaru");

        // print alle hvalpe
        ArrayList<Dog> myOff = myDog.getOffSpring();
        for (Dog myD: myOff) {
            System.out.println(myD);
        }

        // print ejeren
        System.out.println("hunden " + myDog.getDogName() + " er ejet af " + myDog.getOwner());
        System.out.println("hunden " + myDog2.getDogName() + " er ejet af " + myDog2.getOwner());


        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String reString = Dog.feedDog();
        System.out.println(reString);
    }

}
