public class School {

    String schoolName;
    String principalName;
    String schoolAddress;
    int teacherCount;
    int studentCount;
    float avgStudentTeacherRatio;

    public School(String schoolName, String principalName, String schoolAddress, int teacherCount, int studentCount, float avgStudentTeacherRatio) {
        this.schoolName = schoolName;
        this.principalName = principalName;
        this.schoolAddress = schoolAddress;
        this.teacherCount = teacherCount;
        this.studentCount = studentCount;
        this.avgStudentTeacherRatio = avgStudentTeacherRatio;
    }

    public void displaySchoolInformation(){
        System.out.println("School Name is '" + schoolName + "'.");
        System.out.println("School's Principal name is '" + principalName + "'.");
        System.out.println("School's Address is '" + schoolAddress + "'.");
        System.out.println("Teacher Count is '" + teacherCount + "'.");
        System.out.println("Student Count is '" + studentCount + "'.");
        System.out.println("Average Teacher Student Ratio is '" + avgStudentTeacherRatio + "'.");
    }

    public void displaySchoolResult(){
        System.out.println("Everyone passed with flying colours.");
    }
}
