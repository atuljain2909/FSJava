public class ClassRoom {

    String className;
    String classTeacherName;
    String classMonitorName;
    int studentCount;

    public void displaySchoolInformation(){
        System.out.println("Name of the class is '" + className + "'.");
        System.out.println("Name of the class teacher is '" + classTeacherName + "'.");
        System.out.println("Name of the class monitor is '" + classMonitorName + "'.");
        System.out.println("Total number of students studying in '" + className + "' is '" + studentCount + "'.");
    }
}
