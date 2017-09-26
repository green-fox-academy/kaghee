public class Plant {

    String name;
    int currentWater;
    int enoughWater;
    int absorbPercent;

    public Plant(String name) {
        this.name = name;
        currentWater = 0;
    }

    public boolean needsWater() {
        if (currentWater < enoughWater) {
            return true;
        }
        return false;
    }
}
