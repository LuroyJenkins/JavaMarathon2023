package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){
        return Math.abs(year - inputYear);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return year;
    }

    public void setYear(int releaseYear) {
        this.year = releaseYear;
    }
}
