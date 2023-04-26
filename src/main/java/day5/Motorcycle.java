package day5;

public class Motorcycle {
    private String model;
    private String color;
    private int releaseYear;

    public Motorcycle(String model, String color, int releaseYear) {
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
