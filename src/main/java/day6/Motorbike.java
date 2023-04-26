package day6;

public class Motorbike {
    private String model;
    private String color;
    private int releaseYear;

    public Motorbike(String model, String color, int releaseYear) {
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        return Math.abs(releaseYear - inputYear);
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
