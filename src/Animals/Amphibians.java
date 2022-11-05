package Animals;

import java.util.Objects;

public class Amphibians extends Animals {

    private final String biom;

    public Amphibians(String name, int age, String biom) {
        super(name, age);

        if (biom == null || biom.isEmpty()) {
            this.biom = "Отсутствует";
        } else {
            this.biom = biom;
        }
    }

    public final String getBiom() {
        return biom;
    }

    @Override
    public void eat() {
        System.out.println("Ест");
    }

    @Override
    public void sleep() {
        System.out.println("Спит на своей территории");
    }

    @Override
    public void go() {
        System.out.println("Идет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    @Override
    public String toString() {
        return "Животное: " + name + ", возраст: " + age + ", среда обитания: " + biom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
                return false;
        if (!super.equals(obj))
            return false;
        Amphibians amphibians = (Amphibians) obj;
        return biom.equals(amphibians.biom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),biom);
    }
}
