package access.ex;

public class ShoppingCart {
    Item[] items = new Item[10];
    int count = 0;

    public void addItem(Item item){
        if(count == 10){
            System.out.println("장바구니가 가득 찼습니다.");
        }
        else{
            items[count] = item;
            count++;
        }
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for(int i = 0; i<count; i++){
            items[i].showStatus();
            sum += items[i].getTotalPrice();
        }
        System.out.println("전체 가격합:"+sum);
    }


}
