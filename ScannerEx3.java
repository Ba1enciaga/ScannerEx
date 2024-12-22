/* 섹션8.훈련-문제와풀이1 - <음식점 주문>
조건 1.음식의이름(foodName),가격(foodPrice),수량(foodQuantity)
을 입력받아 총 가격을 계산 및 출력
2. 총 가격은 가격*수량이며 totalPrice 변수에 저장
3.출력은: "[음식이름][수량]개를 주문하셨습니다. 총 가격은[총 가격]원입니다.
 */
package scanner.ex;

import java.util.Scanner;


public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();
        System.out.print("음식 가격을 입력해주세요: ");
        int foodPrice = scanner.nextInt();
        System.out.print("음식 수량을 입력해주세요: ");
        int foodQuantity = scanner.nextInt();
        int totalPrice = foodPrice * foodQuantity;
        System.out.print(foodName + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");

    }
}
