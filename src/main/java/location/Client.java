package location;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("좌표를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Line line = Line.of(input);
        System.out.println("두 점 사이 거리는 " + Math.floor(line.length() * 1000000) / 1000000);
    }
}
