/* 반복예제2
조건 1.첫번째숫자와 두번째숫자를 더해서 출력하는 프로그램
2. 모두 0을 입력하면 프로그램 종료
3. 반복문으로 실행
*/
package scanner.ex;
import java.util.Scanner;
public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("첫번째 숫자를 입력하시오");
            int a = scanner.nextInt();//객체를 끌어오는거니까 소문자 scanner이 맞겠지
            System.out.println("두번째 숫자를 입력하시오");
            int b = scanner.nextInt();
            //a,b에 숫자 두개 들어갔다~

            int sum = a + b ;
            System.out.print("두 숫자를 합한 수는" + sum + "입니다. ");

            if ( a == 0 & b == 0)
                System.out.print("프로그램을 종료합니다");
                break;
        }
    }
}
