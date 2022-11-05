package Transport;

public class Car extends Transport {

    public Car(String brand) {
        this(brand, "отсуствует", 2000, "отсуствует", "отсуствует", 100);
    }

    public Car(String brand, String model, int year, String country, String color, int speed) {
        super(brand, model, year, country, color, speed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

}



