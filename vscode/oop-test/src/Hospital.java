import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Patient> patientList;

    public Hospital(String name) {
        this.name = name;
        patientList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPatientCount() {
        return patientList.size();
    }

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
    public void removePatient(Patient patient) {
        patientList.remove(patient);
    }

    public void displayPatients() {
        System.out.println("---Patient List---");
        int i = 1;
        for (Patient patient : patientList) {
            System.out.println("Patient " + i + ": " + patient.getName() + ", age " + patient.getAge());
            i++;
        }
    }
}