package utilities;

import components.Driving;
import components.Junction;

/***
 * @author Shadi
 * main function to start the game
 */
public class GameDriver {

    public static void main(String[] args) {
        Driving driving=new Driving(5, 5);
        driving.drive(5);

    }

}
