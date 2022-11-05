package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {

    protected final String biom;
    protected final int speed;

    public Mammals(String name, int age, String biom, int speed) {
        super(name, age);

        if (biom == null || biom.isEmpty()) {
            this.biom = "Отсутствует";
        } else {
            this.biom = biom;
        }

        if (speed < 0) {
            this.speed = Math.abs(speed);
        } else if (speed == 0) {
            this.speed = 10;
        } else
        this.speed = speed;
    }

    public final String getBiom() {
        return biom;
    }

    public final int getSpeed() {
        return speed;
    }

    abstract public void eat();
    abstract public void sleep();
    abstract public void go();
    abstract public void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o))
            return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(biom,mammals.biom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), biom, speed);
    }
}
