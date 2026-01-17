public class RicePlant {

    // 2.1
    private int id;
    private String riceVariety;
    private GrowthStage stage;

    // 2.2
    private static int totalPlants;

    // 2.3
    public RicePlant(int id, String riceVariety, GrowthStage stage) {
        this.id = ++totalPlants;
        this.riceVariety = riceVariety;
        this.stage = stage;
    }

    // 2.4
    public static int getTotalPlants() {
        return totalPlants;
    }

    // 2.5
    public void displayInfo() {
        System.out.println("Id : " + id);
        System.out.println("riceVariety : " + riceVariety);
        System.out.println("stage : " + stage);
    }

    // 2.6
    public void grow() {
        if (stage == GrowthStage.SEED) {
            stage = GrowthStage.SPROUT;
        } else if (stage == GrowthStage.SPROUT) {
            stage = GrowthStage.VEGETATIVE;
        } else if (stage == GrowthStage.VEGETATIVE) {
            stage = GrowthStage.HEADING;
        } else {
            stage = GrowthStage.HARVEST;
        }
    }
}