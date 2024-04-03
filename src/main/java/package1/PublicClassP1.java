package package1;

public class PublicClassP1 {

    public String publicVariablePublicClassP1 = "publicVariablePublicClassP1";
    protected String protectedVariablePublicClassP1 = "protectedVariablePublicClassP1";
    private String privateVariablePublicClassP1 = "privateVariablePublicClassP1";
    String defaultVariablePublicClassP1 = "defaultVariablePublicClassP1";

    public void publicMethodPublicClassP1() {
        System.out.println("Public Method in Public Class of package1 invoked!");
    }

    private void privateMethodPublicClassP1() {
        System.out.println("Private Method in Public Class of package1 invoked!");
    }

    protected void protectedMethodPublicClassP1() {
        System.out.println("Protected Method in Public Class of package1 invoked!");
    }

    void defaultMethodPublicClassP1() {
        System.out.println("Default Method in Public Class of package1 invoked!");
    }
}
