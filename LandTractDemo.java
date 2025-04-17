public class LandTractDemo {
    public static void main(String[] args) {

        LandTract oldLand = new LandTract(30, 40);
        LandTract newLand = new LandTract(oldLand);

        System.out.println("Old Land: " + oldLand.toString());
        System.out.println("New Land: " + newLand.toString());

        if (oldLand.equals(newLand)) {
            System.out.println("Both land tracts have the same demensions.");
        } else {
            System.out.println("The two land tracts have different dimensions.");
        }
    }
}
