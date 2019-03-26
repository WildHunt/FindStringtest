/**
 * Roman Makeev, for Gdansk University
 */

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        /**
         * Scanner for 2 lines
         */
        System.out.print("Input a line: ");
        Scanner in = new Scanner(System.in);
        String inputLine1 = in.nextLine();
        System.out.print("Input a second line: ");
        String inputLine2 = in.nextLine();
        in.close();

        /**
         * Calling lcs function and print
         */
        Input line1 = new Input(inputLine1.toCharArray(), inputLine2.toCharArray());

        System.out.println("Length of LCS is" + " " + line1.lcs());
    }
}
