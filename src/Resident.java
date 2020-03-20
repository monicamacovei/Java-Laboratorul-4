import java.util.ArrayList;
import java.util.List;

public class Resident implements Comparable{
    protected Hospital hospital;
    protected List<Hospital> hospitalPreferences = new ArrayList();
    public Resident(Hospital ... hospitalPreferences) {
        for(Hospital hospital : hospitalPreferences) {
            this.hospitalPreferences.add(hospital);
        }
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setHospitalPreferences(List<Hospital> hospitalPreferences) {
        this.hospitalPreferences = hospitalPreferences;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public List<Hospital> getHospitalPreferences() {
        return hospitalPreferences;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
