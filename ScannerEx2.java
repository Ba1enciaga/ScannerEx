/* 섹션8.훈련-문제와풀이1 - <홀수 짝수>
조건 1.하나의 정수를 입력받고 홀/짝 판별해라
2.
*/package scanner.ex;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int a = scanner.nextInt();
        if ( a % 2 == 0) {
            System.out.println("이 수는 짝수입니다.");
        }
        else {
            System.out.println("이 수는 홀수입니다.");
        }
    }
}
