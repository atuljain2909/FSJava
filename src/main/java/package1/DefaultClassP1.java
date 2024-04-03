package package1;

class DefaultClassP1 {

    public String publicVariableDefaultClassP1 = "publicVariableDefaultClassP1";
    protected String protectedVariableDefaultClassP1 = "protectedVariableDefaultClassP1";
    private String privateVariableDefaultClassP1 = "privateVariableDefaultClassP1";
    String defaultVariableDefaultClassP1 = "defaultVariableDefaultClassP1";

    public void publicMethodDefaultClassP1() {
        System.out.println("Public Method in Default Class of package1 invoked!");
    }

    private void privateMethodDefaultClassP1() {
        System.out.println("Private Method in Default Class of package1 invoked!");
    }

    protected void protectedMethodDefaultClassP1() {
        System.out.println("Protected Method in Default Class of package1 invoked!");
    }

    void defaultMethodDefaultClassP1() {
        System.out.println("Default Method in Default Class of package1 invoked!");
    }
}
