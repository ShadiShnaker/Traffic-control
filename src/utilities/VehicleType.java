package utilities;

/***
 * @author Shadi
 * init all the valid vehicles in this project
 */
public enum VehicleType {
    car(90), bus(60), bicycle(40), motorcycle(120),
    truck(80), tram(50), semitrailer(85);

    private int averageSpeed;
    /***
     * constructor for vehicles
     * @param averageSpeed
     */
    VehicleType(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    /***
     * getter that returns the average speed for the vehicle
     */
    public int getAverageSpeed(){
        return averageSpeed;
    }
}
