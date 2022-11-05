package Transport;

public class Train extends Transport {

    private double cost;
    private double time;
    private String departureStation;
    private String arrivalStation;
    private int numberOfWagons;


    public Train(String arrivalStation) {
        this("нет", "нет", 1970 ,"Россия", "серый", 150,100, 1.40, "Купчино", arrivalStation, 10);
    }

    public Train(String brand, String model, int year, String country, String color, int speed, double cost, double time, String departureStation, String arrivalStation, int numberOfWagons) {
        super(brand, model, year, country, color, speed);
        setCost(cost); setTime(time); setDepartureStation(departureStation); setArrivalStation(arrivalStation);
        setNumberOfWagons(numberOfWagons);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = Math.abs(cost);
        } else {
            this.cost = cost;
        }
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        if (time <= 0) {
            this.time = Math.abs(time);
        } else {
            this.time = time;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isEmpty()) {
            this.departureStation = "Не указана";
        } else {
            this.departureStation = departureStation;
        }
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation == null || arrivalStation.isEmpty()) {
            this.arrivalStation = "Конечная";
        } else {
            this.arrivalStation = arrivalStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            this.numberOfWagons = Math.abs(numberOfWagons);
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public void getInfoTransport() {
        System.out.println("Поезд: " + getBrand() + ", модель: " + getModel() + ", год выпуска: " + getYear() + ", страна-производитель: " + getCountry() + ", цвет: " + getColor() + ", скорость: " + getSpeed() + ", стоимость: " + getCost() + ", время поездки: " + getTime() + ", отправление из:" + getDepartureStation() + ", прибытие в:" + getArrivalStation() + ", кол-во вагонов: " + getNumberOfWagons());
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }


}
