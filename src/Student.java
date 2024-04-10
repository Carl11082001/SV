public class Student {
    private static int nextId = 1;
    private int id;
    private String name;
    private String gender;
    private int age;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;

    public Student(String name, String gender, int age, double mathScore, double physicsScore, double chemistryScore) {
        this.id = nextId++;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getAverageScore() {
        return (mathScore + physicsScore + chemistryScore) / 3.0;
    }

    public String getAcademicPerformance() {
        double averageScore = getAverageScore();
        if (averageScore >= 8.0) {
            return "Giỏi";
        } else if (averageScore >= 6.5) {
            return "Khá";
        } else if (averageScore >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Age: " + age +
                ", Math Score: " + mathScore + ", Physics Score: " + physicsScore +
                ", Chemistry Score: " + chemistryScore + ", Average Score: " + getAverageScore() +
                ", Academic Performance: " + getAcademicPerformance();
    }
}
