package model.basic;

public class Location {
    private String country;
    private String region;
    private String settlement;

    public Location(String country, String region, String name) {
        this.country = country;
        this.region = region;
        this.settlement = name;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getSettlement() {
        return settlement;
    }

    @Override
    public String toString() {
        return country +
                ", " + region +
                ", " + settlement;
    }
}
