public class Patient {
    private String name;
    private int age;
    private int healthScore;

    public Patient(String name, int age, int healthScore) {
        this.name = name;
        this.age = age;
        this.healthScore = (1 <= healthScore && healthScore <= 10) ? healthScore : 5;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthScore() {
        return healthScore;
    }
    public void setHealthScore(int healthScore) {
        if (isValidHealth(healthScore)) this.healthScore = healthScore;
        else {
            System.out.println("Invalid health score (not 1-10).");
        }
    }

    public void displayInfo() {
        System.out.println("---Patient Info---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Health Score: " + healthScore + "/10");
    }

    public boolean isHealthy() {
        return (healthScore >= 7);
    }

    public boolean needsAttention() {
        return (healthScore <=3);
    }

    public void recover() {
        if (isValidHealth(healthScore + 1)) healthScore++;
    }
    public void deteriorate() {
        if (isValidHealth(healthScore - 1)) healthScore--;
    }

    private boolean isValidHealth(int health) {
        return (1 <= health && health <= 10);
    }
}
