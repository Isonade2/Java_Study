package poly.basic;

public class CastringMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child;
        Parent parent3 = new Child();
        parent1.parentMethod();
        parent2.parentMethod();
    }
}
