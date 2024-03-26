public class Runner {

    public static void main (String[] args) {

        School sc1 = new School("Father Agnel School", "Mr. Alexander Coates Rede", "Sector-62, Noida", 50, 2500, 25.5F);
        sc1.displaySchoolInformation();
        sc1.displaySchoolResult();

        Teacher t1 = new Teacher("Sarmistha De", "Female", "English");
        t1.displayTeacherInformation();

        Student s1 = new Student("Kiaan Jain", "Male", 12);
        s1.displayStudentInformation();

        ClassRoom cr1 = new ClassRoom("Nur-E", "Sarmistha De", "Kiaan Jain", 42);
        cr1.displaySchoolInformation();
    }

}
