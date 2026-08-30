public class Pet {
    public Pet(String name, String animal) {
        private String pName = name;
        private int pAge = 0;
        private String pAnimal = animal;
    }

    public String getName() {
        return this.pName;
    }

    public int getAge() {
        return pAge;
    }
    public void grow() {
        pAge++;
    }
}