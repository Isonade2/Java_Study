package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder product1 = createOrder("두부",2000,2);
        ProductOrder product2 = createOrder("김치",5000,1);
        ProductOrder product3 = createOrder("콜라",1500,2);
        ProductOrder[] orders = {product1,product2,product3};
        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: "+total);
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
