package extends1.access.parent;

public class Parent {
    public int publicValue;
    int defaultValue;
    private int privateValue;
    protected int protectedValue;

    public void publicMethod(){
        System.out.println("Parent.Method");
    }
    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod(){
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod(){
        System.out.println("Parent.privateMethod");
    }
    
    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);//부모 메서드 안에서 접근가능
        System.out.println("privateValue = " + privateValue);// 부모 메서드 안에서 접근가능

        defaultMethod();
        privateMethod();
    }
}
