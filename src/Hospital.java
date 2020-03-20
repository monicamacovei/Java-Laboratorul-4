import java.util.Objects;

public class Hospital {
    protected int capacity;
    public Hospital(int capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return capacity == hospital.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "capacity=" + capacity +
                '}';
    }
}
