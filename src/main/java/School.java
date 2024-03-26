public class School {

    String schoolName;
    String principalName;
    String schoolAddress;
    int teacherCount;
    int studentCount;
    float teacherStudentRatio;

    public void displaySchoolInformation(){
        System.out.println("School Name is '" + schoolName + "'.");
        System.out.println("School's Principal name is '" + principalName + "'.");
        System.out.println("School's Address is '" + schoolAddress + "'.");
        System.out.println("Teacher Count is '" + teacherCount + "'.");
        System.out.println("Student Count is '" + studentCount + "'.");
        System.out.println("Teacher Student Ratio is '" + teacherStudentRatio + "'.");
    }

    public void displaySchoolResult(){
        System.out.println("Everyone passed with flying colours.");
    }
}
