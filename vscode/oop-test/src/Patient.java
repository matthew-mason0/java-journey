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
        if (1 <= healthScore && healthScore <= 10) this.healthScore = healthScore;
        else {
            System.out.println("Invalid health score (not 1-10).");
        }
    }
}
