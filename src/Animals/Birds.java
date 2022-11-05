package Animals;

import java.util.Objects;

public abstract class Birds extends Animals{

    protected String biom;

    public Birds(String name, int age, String biom) {
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

    abstract public void eat();
    abstract public void sleep();
    abstract public void go();
    abstract public void hunt();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o))
            return false;
        Birds birds = (Birds) o;
        return biom.equals(birds.biom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),biom);
    }
}
