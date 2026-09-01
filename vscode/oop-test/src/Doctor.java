public class Doctor {
    private String name;
    private String specialisation;

    public Doctor(String name, String specialisation) {
        this.name = name;
        this.specialisation = specialisation;
    }

    public void examine(Patient patient) {
        System.out.println("---Examination---");
        System.out.println("Dr. " + name + " is examining " + patient.getName() + ".");
        System.out.println(patient.getName() + "\'s health score is " + patient.getHealthScore() + "/10.\n");
    }
}
