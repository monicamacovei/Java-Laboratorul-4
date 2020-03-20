import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hospital implements Comparable {
    protected int capacity;
    protected List<Resident> residentPreferences = new ArrayList();
    public Hospital(int capacity, Resident ... residentPreferences) {
        this.capacity = capacity;
        for(Resident resident : residentPreferences) {
            this.residentPreferences.add(resident);
        }
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setResidentPreferences(Resident ... residentPreferences) {
        for(Resident resident : residentPreferences) {
            this.residentPreferences.add(resident);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Resident> getResidentPreferences() {
        return residentPreferences;
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

    @Override
    public int compareTo(Object o) {
        return this.capacity - ((Hospital)o).capacity;
    }

}
