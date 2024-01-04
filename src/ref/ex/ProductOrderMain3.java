package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = input.nextInt();
        ProductOrder[] orders = new ProductOrder[n];
        for(int i=0; i<n; i++){
            System.out.printf("%d번째 주문 정보를 입력하세요.%n",i+1);
            System.out.printf("상품명: ");
            String productName = input.next();
            System.out.printf("가격: ");
            int price = input.nextInt();
            System.out.printf("수량: ");
            int quantity = input.nextInt();
            ProductOrder product = createOrder(productName,price,quantity);
            orders[i] = product;
        }
        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder product:orders){
            System.out.println("상품명: "+product.productName+" 가격: "+product.price+" 수량: "+product.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for(ProductOrder p:orders){
            total+= (p.price*p.quantity);
        }
        return total;
    }
}
