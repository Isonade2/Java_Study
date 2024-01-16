package poly.ex.pay0;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PayService payService = new PayService();

        while(true){
            System.out.println("결제수단을 입력하세요:");
            String payOption = input.next();
            if(payOption.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.println("결제 금액을 입력하세요:");
            int amount = input.nextInt();
            payService.processPay(payOption, amount);
        }
    }
}
