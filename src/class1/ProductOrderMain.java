package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder Product1 = new ProductOrder();
        Product1.productName = "두부";
        Product1.price = 2000;
        Product1.quantity = 2;

        ProductOrder Product2 = new ProductOrder();
        Product2.productName = "김치";
        Product2.price = 5000;
        Product2.quantity = 1;

        ProductOrder Product3 = new ProductOrder();
        Product3.productName = "콜라";
        Product3.price = 1500;
        Product3.quantity = 2;


        ProductOrder[] Products = {Product1,Product2,Product3};

        int result = 0;
        for(ProductOrder p : Products){
            System.out.printf("상품명: %s, 가격: %d, 수량: %d%n",p.productName,p.price,p.quantity);
            result += (p.price*p.quantity);
        }
        System.out.printf("총 결제 금액: %d",result);
    }
}
