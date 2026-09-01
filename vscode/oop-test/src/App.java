public class App {
    public static void main(String[] args) throws Exception {
        Patient patient1 = new Patient("Matthew", 21, 5);
        patient1.displayInfo();

        Doctor doctor1 = new Doctor("Wang", "Brain");
        doctor1.examine(patient1);
    }
}
