/* 섹션8.훈련-문제와풀이1 - <구구단 출력>
조건 1.하나의 정수를 입력받고 그 수부터 구구단출력해라
Ex) 8입력 받으면 8,16,24 ~
 */

package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = scanner.nextInt();
        System.out.println(n + "단의 구구단:");
        for(int a = 1; a <= 9; a++) {
            int cross = a * n ;
            System.out.println(n + "X" + a +" =" + cross);
        }
    }
}
