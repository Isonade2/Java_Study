package access.ex;

public class Item {
    private String name;
    private int price;
    private int qty;

    Item(String name, int price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public void showStatus(){
        int sum = 0;

        System.out.printf("상품명:%s, 합계:%d\n",this.name,(this.price*this.qty));

    }

    public int getTotalPrice(){
        return this.price*this.qty;
    }
}
