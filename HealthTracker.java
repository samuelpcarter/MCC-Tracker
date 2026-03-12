/**
 * CLASS INVARIANT
 * - height must be in total inches
 */
public abstract class HealthTracker {
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
            System.out.println("ERROR: bad data given to constructor");
            System.exit(0);
        }
    }

    public HealthTracker() {
        this(DEFAULT_WEIGHT, DEFAULT_HEIGHT);
    }

    public HealthTracker(HealthTracker original) {
        if (original == null) {
            // handle error
            System.out.println("ERROR: null given to copy constructor");
            System.exit(0);
        }
        this.weight = original.weight;
        this.height = original.height;
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

    public int getHeightInInches() {
        return this.height;
    }

    /**
     * Get height in string form (feet and inches)
     * 
     * @return string with feet and inches form
     */
    public String getHeight() {
        int feet = this.height / 12;
        int inches = this.height % 12;
        return feet + " ft " + inches + " in";
    }


    // other required methods
    @Override
    public String toString() {
        return "Weight = " + this.weight +
                ", Height = " + this.height;
    }

    @Override
    public boolean equals(Object other) {
        // null
        if (other == null) {
            return false;
        } else if (!(other instanceof HealthTracker)) {// "same" type
            // different type
            return false;

        } else {
            // exists AND "same type"
            // check all the data
            HealthTracker otherTracker = (HealthTracker) other;
            return this.height == otherTracker.height && this.weight == otherTracker.weight;
        }

    }

    public abstract void printEncouragingMessage();
}