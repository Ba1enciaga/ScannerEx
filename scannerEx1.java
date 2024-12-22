/* 섹션8.훈련-문제와풀이1 - 이름나이 입력받고 출력하기
조건 1.
2.
*/
package scanner.ex;
import java.util.Scanner;

public class scannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름이 뭐에요?");
        String name = scanner.nextLine();
        System.out.println("전화번호뭐에요?");
        int age = scanner.nextInt();
        //name int 변수 입력완료
        System.out.println("당신의 이름은 " + name + " 이고, 나이는 "+ age + "살입니다");

    }
}
