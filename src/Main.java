import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.print("Input a line: ");
        Scanner in = new Scanner(System.in);
        String inputLine1 = in.nextLine();
        System.out.print("Input a second line: ");
        String inputLine2 = in.nextLine();
        in.close();

        char[] stringToCharArray = inputLine1.toCharArray();
        char[] stringToCharArray1 = inputLine2.toCharArray();

        Input line1 = new Input(inputLine1.toCharArray());
        Input line2 = new Input(inputLine2.toCharArray());

        System.out.println(line1);
        System.out.println(line2);

       System.out.println(line1.check1(line1,line2));

    }
}
