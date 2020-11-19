package Chapter_11_Enumeration.P212_Excercises;

public enum Planets {
    MERCURY("3.3 x 10^23","0.39 AU"),
    VENUS("4.87 x 10^24","0.723 AU"),
    EARTH("5.98 x 10^24", "1 AU"),
    MARS("6.42 x 10^23","1.524 AU"),
    JUPITER("1.90 x 10^27","5.203 AU"),
    SATURN("5.69 x 10^26","9.539 AU"),
    URANUS("8.68 x 10^25", "19.18 AU"),
    NEPTUNE("1.02 x 10^26","30.06 AU");

    private String mass;
    private String distanceToSun;

    Planets(String mass, String distanceToSun){
        this.mass = mass;
        this.distanceToSun = distanceToSun;

    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(String distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    @Override
    public String toString() {
        return "Planet info{ " +
                "mass: " + getMass() + " kg " +
                ", distance to the sun: " + getDistanceToSun() +
                "}";
    }
}
