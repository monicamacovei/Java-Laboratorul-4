import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Hospital H0 = new Hospital(1);
        Hospital H1 = new Hospital(2);
        Hospital H2 = new Hospital(2);
        Resident R0 = new Resident(H0,H1,H2);
        Resident R1 = new Resident(H0,H1,H2);
        Resident R2 = new Resident(H0,H1);
        Resident R3 = new Resident(H0,H2);
        R0.setHospital(H1);
        R1.setHospital(H2);
        R2.setHospital(H1);
        R3.setHospital(H0);
        H0.setResidentPreferences(R3,R0,R1,R2);
        H1.setResidentPreferences(R0,R2,R1);
        H2.setResidentPreferences(R0, R1, R3);
        //Create a list of residents, using an ArrayList implementation. Sort the residents, using a comparator.
        List<Resident> residentsList = new ArrayList();
        residentsList.add(R0);
        residentsList.add(R1);
        residentsList.add(R2);
        residentsList.add(R3);

        //Create a set of hospitals, using a TreeSet implementation. Make sure that Hospital objects are comparable.
        TreeSet<Hospital> hospitalTreeSet = new TreeSet<Hospital>();
        hospitalTreeSet.add(H0);
        hospitalTreeSet.add(H1);
        hospitalTreeSet.add(H2);

        //Create two maps (having different implementations)
        // describing the residents and the hospital preferences and print them on the screen.
        HashMap<Resident, Hospital> firstMap=new HashMap<Resident, Hospital>();
        firstMap.put(R1, H1);
        firstMap.put(R1, H2);
        firstMap.put(R2, H1);
        firstMap.put(R3, H0);
        for(Map.Entry m:firstMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        TreeMap<Resident, Hospital> secondMap=new TreeMap<Resident, Hospital>();
        secondMap.put(R1, H1);
        secondMap.put(R1, H2);
        secondMap.put(R2, H1);
        secondMap.put(R3, H0);
        for(Map.Entry m:secondMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //Using Java Stream API, write queries that display the residents who
        // find acceptable H0 and H2, and the hospitals that have R0 as their top preference.
        List<Hospital> acceptableHospitals = new ArrayList();
        acceptableHospitals.add(H0);
        acceptableHospitals.add(H2);
        List<Resident> residentList =  residentsList.stream()
                .filter(resident -> resident.hospitalPreferences.containsAll(acceptableHospitals))
                .collect(Collectors.toList());


        List<Hospital> hospitalList =  hospitalTreeSet.stream()
                .filter(hospital -> hospital.residentPreferences.get(0).equals(R0))
                .collect(Collectors.toList());;
    }
}
