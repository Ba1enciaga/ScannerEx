/* 반복예제1
조건 1.사용자가 입력한 문자열을 그대로 출력하는 예제
2.exit 문자 입력 시 프로그램 종료
*/

package scanner.ex;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("문자를 입력하세요");
            String str = scanner.nextLine();
            System.out.println(str);

            if (str.equals("exit")) {
                System.out.println("반복문을 종료합니다");
                break;
            }
        }
    }
}
