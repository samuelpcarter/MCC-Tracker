/**
 * CLASS INVARIANT
 * - height must be in total inches
 */
public class HealthTracker {
    // constants
    public static final double DEFAULT_WEIGHT = 100;
    public static final int DEFAULT_HEIGHT = 100;

    // instance vars
    private double weight;
    private int height; // in inches

    // constructors
    public HealthTracker(double weight, int height) {
        boolean isValid = this.setWeight(weight) && this.setHeight(height);
        if (!isValid) {
            // handle error
            System.out.println("ERROR: bad data given to full constructor");
            System.exit(0);
        }
    }

    // mutators
    public boolean setWeight(double weight) {
        if (weight > 0) { //only set if valid data
            this.weight = weight;
            return true;
        } else {
            return false;
        }
    }

    public boolean setHeight(int height) {
        if (height > 0) { // only set if valid data
            this.height = height;
            return true;
        } else {
            return false;
        }
    }

    public boolean setHeight(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        return setHeight(totalInches);
    }

    // accessors
    public double getWeight() {
        return this.weight;
    }

    public double getHeightInInches() {
        return this.height;
    }

    public String getHeight() {
        int feet = this.height / 12;
        int inches = this.height % 12;
        return feet + " ft " + inches + " in";
    }


    // other required methods
    @Override
    public String toString() {
        return "HealthTracker: weight = " + this.weight +
                ", height = " + this.height;
    }
}