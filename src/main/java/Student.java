public class Student {

    String studentName;
    String studentGender;
    int rollNumber;

    public Student(String studentName, String studentGender, int rollNumber) {
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.rollNumber = rollNumber;
    }

    public void displayStudentInformation(){
        System.out.println("Student's Name is '" + studentName + "'.");
        System.out.println("Student's Gender is '" + studentGender + "'.");
        System.out.println("Student's roll number is '" + rollNumber + "'.");
    }
}
