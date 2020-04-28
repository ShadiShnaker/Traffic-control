package components;

import utilities.Timer;
import utilities.Utilities;

import java.util.ArrayList;
import java.util.Objects;

/***
 * class Driving
 * @author Shadi
 */
public class Driving implements Utilities, Timer{
    /* Fields */
    private Map map;
    private ArrayList<Vehicle> vehicles;
    private int drivingTime;
    private ArrayList<Timer> allTimedElements;

    /* Ctor */

    /***
     * Constructor for Driving class
     * @param numOfJunctions
     * @param numOfVehicles
     */
    public Driving(int numOfJunctions, int numOfVehicles)
    {
        //map
        this.vehicles = new ArrayList<Vehicle>(numOfVehicles);
        this.drivingTime = 0;
        this.allTimedElements = new ArrayList<Timer>();
        successMessage(toString());
    }

    /* Methods */

    /***
     * for each turn the call incrementDrivingTime method
     * @param numOfTurns
     */
    public void drive(int numOfTurns){

    }

    /***
     * for each object(vehicle & trafficLights) increase the turn amount
     */
    public void incrementDrivingTime(){

    }

    /* setter & getters */
    public ArrayList<Timer> getAllTimedElements() {
        return allTimedElements;
    }

    public void setAllTimedElements(ArrayList<Timer> allTimedElements) {
        this.allTimedElements = allTimedElements;
    }

    public int getDrivingTime() {
        return drivingTime;
    }

    public void setDrivingTime(int drivingTime) {
        this.drivingTime = drivingTime;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    /* toString & equals() */

    @Override
    public String toString() {
        return "Driving{" +
                "map=" + map +
                ", vehicles=" + vehicles +
                ", drivingTime=" + drivingTime +
                ", allTimedElements=" + allTimedElements +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driving)) return false;
        Driving driving = (Driving) o;
        return getDrivingTime() == driving.getDrivingTime() &&
                Objects.equals(getMap(), driving.getMap()) &&
                Objects.equals(getVehicles(), driving.getVehicles()) &&
                Objects.equals(getAllTimedElements(), driving.getAllTimedElements());
    }
}
