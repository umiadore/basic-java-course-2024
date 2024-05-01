package classwork20.example2;

public enum TrafficLightsColor {

    RED("Red", false),
    YELLOW ("Yellow", false),
    GREEN("Green", true);

    private String colorName;
    private boolean canGo;

    // constructor
    private TrafficLightsColor(String colorName, boolean canGo) {
        this.colorName = colorName;
        this.canGo = canGo;
    }

    // getters x setters
    public String getColorName() {
        return colorName;
    }
    public boolean isCanGo() {
        return canGo;
    }

}
