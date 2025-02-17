package input;

import java.util.Scanner;

public class Input {

    static Scanner sc = new Scanner(System.in);

public static int numberInput() {
    int num = sc.nextInt();
    return num;
}

public static String stringInput() {
    String str = sc.next();
    return str;
}

}
