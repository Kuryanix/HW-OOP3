package Transport;

public abstract class Transport {

    protected String brand;
    protected String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int speed;


    public Transport(String brand) {
        this(brand, "отсуствует", 2000, "отсуствует", "отсуствует", 100);
    }

    public Transport(String brand, String model, int year, String country, String color, int speed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Инфо отсуствует";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "Инфо отсуствует";
        } else {
            this.model = brand;
        }

        if (year < 1800 || year > 2022) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty()) {
            this.country = "Инфо отсуствует";
        } else {
            this.country = brand;
        }

        setColor(color);
        setSpeed(speed);
    }

    public String getBrand () {
                return brand;
            }

            public String getModel () {
                return model;
            }

            public int getYear () {
                return year;
            }

            public String getCountry () {
                return country;
            }

            public String getColor () {
                return color;
            }

            public void setColor (String color){
                if (color == null || color.isEmpty()) {
                    this.color = "Информация отсутствует";
                } else {
                    this.color = color;
                }
            }

            public int getSpeed () {
                return speed;
            }

            public void setSpeed ( int speed){
                if (speed < 100) {
                    this.speed = 100;
                } else {
                    this.speed = speed;
                }
            }

            public void getInfoTransport() {
                System.out.println("Название: " + getBrand() + ", модель: " + getModel() + ", год выпуска: " + getYear() + ", страна-производитель: " + getCountry() + ", цвет: " + getColor() + ", скорость: " + getSpeed());
            }

            protected abstract void refill();


}
