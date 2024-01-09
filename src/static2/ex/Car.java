package static2.ex;

public class Car {
    static int count = 0;
    private String name;
    public Car(String name){
        this.name = name;
        count += 1;
        System.out.println("차량 구입, 이름: "+name);
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: "+count);
    }

}
