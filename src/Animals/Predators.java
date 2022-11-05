package Animals;

import java.util.Objects;

public class Predators extends Mammals {

    private String typeOfFood;

    public Predators(String name, int age, String biom, int speed, String typeOfFood) {

        super(name, age, biom, speed);

        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "Мясо";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public final String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println("Ест мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Спит на своей территории");
    }

    @Override
    public void go() {
        System.out.println("Идет");
    }

    @Override
    public void walk() {
        System.out.println("Гуляет без цели");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    @Override
    public String toString() {
        return "Животное: " + name + ", возраст: " + age + ", среда обитания: " + biom + ", скорость: " + speed + ", тип пищи: " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeOfFood.equals(predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}

