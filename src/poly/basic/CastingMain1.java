package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //poly.childMethod();

        Child child = (Child)poly;
        child.childMethod();


        Parent poly1 = new Child();
        ((Child)poly1).childMethod();
    }
}
