package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s ="hello world";
        String deco = DecoUtil2.deco(s);
        System.out.println("before: "+s);
        System.out.println("after: "+ deco);
    }
}