import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int id, String name, String gender, int age, double mathScore, double physicsScore, double chemistryScore) {
        Student studentToUpdate = findStudentById(id);
        if (studentToUpdate != null) {
            studentToUpdate.setName(name);
            studentToUpdate.setGender(gender);
            studentToUpdate.setAge(age);
            studentToUpdate.setMathScore(mathScore);
            studentToUpdate.setPhysicsScore(physicsScore);
            studentToUpdate.setChemistryScore(chemistryScore);
            System.out.println("Student with ID " + id + " has been updated.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void removeStudent(int id) {
        Student studentToRemove = findStudentById(id);
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student with ID " + id + " has been removed.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public List<Student> searchStudentsByName(String name) {
        List<Student> searchResult = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                searchResult.add(student);
            }
        }
        return searchResult;
    }

    public void sortStudentsByGPA() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore).reversed());
        System.out.println("Students sorted by GPA.");
    }

    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
