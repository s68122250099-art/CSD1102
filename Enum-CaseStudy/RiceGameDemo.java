
public class RiceGameDemo {

    public static void main(String[] args) {
        // TODO 3.1:
        RicePlant r1 = new RicePlant(1, "R1", GrowthStage.SEED);
        RicePlant r2 = new RicePlant(1, "R2", GrowthStage.SPROUT);
        RicePlant r3 = new RicePlant(1, "R3", GrowthStage.VEGETATIVE);

        // TODO 3.2:
        System.out.println("--------------------------------");
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();

        // TODO 3.3:
        System.out.println("--------------------------------");
        System.out.println("Total rice plants: " + RicePlant.getTotalPlants());

        // TODO 3.4
        System.out.println("--------------------------------");
        r1.grow();
        r2.grow();
        r3.grow();
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();

    }
}
