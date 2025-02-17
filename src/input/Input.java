package input;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

public int numberInput () {
    int num = sc.nextInt();
    return num;
}

public String stringInput () {
    String str = sc.next();
    return str;
}

}
