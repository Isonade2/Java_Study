package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterFaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
