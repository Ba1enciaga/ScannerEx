/* 'Scanner-반복예제' - 반복예제3
조건 1.사용자 입력을 받은 수를 계산
2. 한번에 한개 정수를 입력 , 0을 입력하면 프로그램 종료
3. 종료될 때까지 사용자가 입력한 모든 정수의 합 출력해야함
*/
package scanner.ex;
import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.println("숫자를 입력하세요");
            int a = scanner.nextInt();
            sum = sum + a;
            System.out.println("지금까지 더한 숫자는" + sum);

            if (a == 0) {
                System.out.print("프로그램 종료");
                break;
            } // break문은 가장 가까운 반복문을 종료하는 기능!!
        }
    }
}
