import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\nDanhsach:");
            System.out.println("1. them sinh vien");
            System.out.println("2. cap nhat sinh vien theo ID");
            System.out.println("3. xoa sinh vien theo ID");
            System.out.println("4. tim kiem sinh vien theo ten");
            System.out.println("5. sap xep sinh vien theo diem tb");
            System.out.println("6. sap xep sinh vien theo ten");
            System.out.println("7. hien thi sinh vien");
            System.out.println("8. thoat chuong trinh");

            System.out.print("lựa chọn: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("nhập giới tính: ");
                    String gender = scanner.nextLine();
                    System.out.print("nhập tuổi: ");
                    int age = scanner.nextInt();
                    System.out.print("nhập điểm toán: ");
                    double mathScore = scanner.nextDouble();
                    System.out.print("nhập điểm lí: ");
                    double physicsScore = scanner.nextDouble();
                    System.out.print("nhập điểm hoá: ");
                    double chemistryScore = scanner.nextDouble();
                    Student newStudent = new Student(name, gender, age, mathScore, physicsScore, chemistryScore);
                    sms.addStudent(newStudent);
                    System.out.println("sinh viên được nhập thành công.");
                    break;
                case 2:
                    System.out.print("Nhập ID sinh viên để cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("nhập tên mới: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("nhập giới tính mới: ");
                    String updatedGender = scanner.nextLine();
                    System.out.print("nhập tuổi mới: ");
                    int updatedAge = scanner.nextInt();
                    System.out.print("nhập điểm toán mới: ");
                    double updatedMathScore = scanner.nextDouble();
                    System.out.print("nhập điểm lí mới: ");
                    double updatedPhysicsScore = scanner.nextDouble();
                    System.out.print("nhập điểm hoá mới: ");
                    double updatedChemistryScore = scanner.nextDouble();
                    sms.updateStudent(updateId, updatedName, updatedGender, updatedAge, updatedMathScore, updatedPhysicsScore, updatedChemistryScore);
                    break;
                case 3:
                    System.out.print("nhập ID sinh viên để xoá: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    sms.removeStudent(removeId);
                    break;
                case 4:
                    System.out.print("nhập tên sinh viên để tìm kiếm: ");
                    String searchName = scanner.nextLine();
                    List<Student> searchResult = sms.searchStudentsByName(searchName);
                    if (searchResult.isEmpty()) {
                        System.out.println("không thấy tên của sinh viên này: " + searchName);
                    } else {
                        System.out.println("danh sách tìm kiếm tên: " + searchName);
                        for (Student student : searchResult) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 5:
                    sms.sortStudentsByGPA();
                    break;
                case 6:
                    sms.sortStudentsByName();
                    break;
                case 7:
                    sms.displayStudents();
                    break;
                case 8:
                    System.out.println("thoát chương trình...");
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn lại,tuỳ chọn không hợp lệ.");
            }
        }
    }
}
