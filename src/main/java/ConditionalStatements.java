public class ConditionalStatements {

    public static void main(String[] args) {

        ConditionalStatements cs = new ConditionalStatements();
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(1,"Male"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(17,"Male"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(18,"Male"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(59,"Male"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(60,"Male"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(-1,"Male"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(1,"Female"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(17,"Female"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(18,"Female"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(59,"Female"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(60,"Female"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(-1,"Female"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(1,"Other"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(17,"Other"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(18,"Other"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(59,"Other"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(60,"Other"));
        System.out.println(cs.getOutputMessageBasedOnAgeAndGender(-1,"Other"));







    }

    public String getOutputMessageBasedOnAgeAndGender(int age, String gender) {
        if (age > 0 && age < 18) {
            if (gender.equals("Male")) {
                return "Boy";
            } else if (gender.equals("Female")){
                return "Girl";
            }
            else{
                return "Learn more about genders!";
            }
        }
        else if (age >= 18 && age < 60){
                if (gender.equals("Male")){
                    return "Man";
                }
                else if (gender.equals("Female")){
                    return "Woman";
                }
                else{
                    return "Learn more about genders!";
                }
        }
        else if (age>=60) {
            if (gender.equals("Male") || gender.equals("Female")) {
                return "Senior Citizen";
            } else {
                return "Learn more about genders!";
            }
        }
        else {
            return "Learn more about ages!";
            }
    }
}
