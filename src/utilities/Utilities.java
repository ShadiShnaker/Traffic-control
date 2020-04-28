package utilities;

import java.util.ArrayList;
import java.util.Random;

/***
 * @author Shadi
 * interface
 */
public interface Utilities {
    /***
     *
     * @param Val
     * @param min
     * @param max
     * @return true if  min <= val <= max
     */
    public default boolean checkValue(double Val, double min, double max){
        if (Val < min || Val > max)
            return false;
        else
            return true;
    }

    /***
     * printing message when replacing wrong value with correct value
     * @param wrongVal
     * @param correctVal
     * @param varName
     */
    public default void correctingMessage(double wrongVal, double correctVal, String varName) {
        System.out.println("The value of: " + varName + " has been replaced from: " + wrongVal +
                " to: " + correctVal);
    }

    /***
     * printing message with the wrong value
     * @param wrongVal
     * @param varName
     */
    public default void errorMessage(double wrongVal, String varName){
        System.out.println("Error! the value of " + varName + "=" + wrongVal +
                " out of the range!");
    }

    /***
     * returns random boolean value
     * @return
     */
    public default boolean getRandomBoolean(){
        return Math.random() < 0.5;
    }

    /***
     * returns random double value between min and max
     * @param min
     * @param max
     * @return
     */
    public default double getRandomDouble(double min, double max) {
        return (Math.random() * (max - min)) + min;
    }

    /***
     * return random int value between min and max
     * @param min
     * @param max
     * @return
     */
    public default int getRandomInt(int min, int max){
        return (int)(Math.random() * (max - min)) + min;
    }

    /***
     * return array of Random integer values
     * @param min
     * @param max
     * @param size
     * @return
     */
    public default ArrayList<Integer> getRandomIntArray(int min, int max, int size){
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        for(int i = 0; i < size; i++)
        {
            arr.set(i, (int)(Math.random() * (max - min)) + min);
        }
        return arr;
    }

    /***
     * printing message when object created successfully
     * @param objName
     */
    public default void successMessage(String objName){
        System.out.println("The object: " + objName + "has been created successfully");
    }
}
