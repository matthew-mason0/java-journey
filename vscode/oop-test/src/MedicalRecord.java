import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private Patient patient;
    private String diagnosis;
    private List<String> notes;

    public MedicalRecord(Patient patient) {
        this.patient = patient;
        notes = new ArrayList<>();
    }

    public void addNote(String note) {
        notes.add(note);
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
