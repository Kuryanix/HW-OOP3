package Animals;

import java.util.Objects;

public class Flying extends Birds{

    private String typeOfMovement;

    public Flying(String name, int age, String biom, String typeOfMovement) {

        super(name, age, biom);

        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "по воздуху";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public final String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public void eat() {
        System.out.println("Ест");
    }

    @Override
    public void sleep() {
        System.out.println("Спит");
    }

    @Override
    public void go() {
        System.out.println("Идет");
    }

    public void fly() {
        System.out.println("Летает");
    }

    @Override
    public void hunt() {
        System.out.println("Охотится");
    }

    @Override
    public String toString() {
        return "Животное: " + name + ", возраст: " + age + ", среда обитания: " + biom + ", тип передвижения: " + typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o))
            return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}

