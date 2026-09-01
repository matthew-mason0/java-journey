public class App {
    public static void main(String[] args) throws Exception {
        Patient patient1 = new Patient("Matthew", 21, 6);
        patient1.displayInfo();

        Patient patient2 = new Patient("Bethan", 18, 8);

        Doctor doctor1 = new Doctor("Wang", "Brain");
        doctor1.examine(patient1);

        Hospital hospital1 = new Hospital("St. Mary\'s");
        hospital1.addPatient(patient1);
        hospital1.addPatient(patient2);

        hospital1.displayPatients();
    }
}
