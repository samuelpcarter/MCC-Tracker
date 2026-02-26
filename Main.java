public class Main {
    public static void main(String[] args) {
        HealthTracker tester = new HealthTracker(50, 50);

        System.out.println("Start = " + tester);

        tester.setWeight(205.6);
        tester.setHeight(100);
        System.out.println("Height = " + tester.getHeight());

        System.out.println("After changes = " + tester);
        // Test for setWeight method
        // testSetWeight();
    }

    // public static void testSetWeight() {
    // HealthTracker ht = new HealthTracker();
    // double testWeight = 205.6;
    // boolean isValid = ht.setWeight(testWeight);
    // if (isValid) {
    // System.out.println("setWeight test passed: weight set to " + testWeight);
    // } else {
    // System.out.println("setWeight test failed: expected " + testWeight + ", got "
    // + ht.getWeight());
    // }
    // }
}
