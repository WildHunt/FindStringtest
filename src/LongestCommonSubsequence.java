//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;
//
///* Dynamic Programming Java implementation of LCS problem */
//public class LongestCommonSubsequence
//{
//
//    /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
//    int lcs( char[] X, char[] Y, int m, int n )
//    {
//        int L[][] = new int[m+1][n+1];
//
//	/* Following steps build L[m+1][n+1] in bottom up fashion. Note
//		that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
//        for (int i=0; i<=m; i++)
//        {
//            for (int j=0; j<=n; j++)
//            {
//                if (i == 0 || j == 0)
//                    L[i][j] = 0;
//                else if (X[i-1] == Y[j-1])
//                    L[i][j] = L[i-1][j-1] + 1;
//                else
//                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
//                //print
//            }
//            printMatrix(L);
//
//        }
//        printlcs(L,m,n,X,Y);
//
//        return L[m][n];
//    }
//    public void printlcs(int L[][],int m,int n,char[] X, char[] Y){
//        int index = L[m][n];
//        int temp = index;
//
//        // Create a character array to store the lcs string
//        char[] lcs = new char[index+1];
//        lcs[index] = ' '; // Set the terminating character
//
//        // Start from the right-most-bottom-most corner and
//        // one by one store characters in lcs[]
//        int i = m, j = n;
//        while (i > 0 && j > 0)
//        {
//            // If current character in X[] and Y are same, then
//            // current character is part of LCS
//            if (X[i-1] == Y[j-1])
//            {
//                // Put current character in result
//                lcs[index-1] = X[i-1];
//
//                // reduce values of i, j and index
//                i--;
//                j--;
//                index--;
//            }
//
//            // If not same, then find the larger of two and
//            // go in the direction of larger value
//            else if (L[i-1][j] > L[i][j-1])
//                i--;
//            else
//                j--;
//        }
//
//        // Print the lcs
//        System.out.print("LCS of "+X.toString()+" and "+Y.toString()+" is ");
//        for(int k=0;k<=temp;k++)
//            System.out.print(lcs[k]);
//    }
//
//    /* Utility function to get max of 2 integers */
//    int max(int a, int b)
//    {
//        return (a > b)? a : b;
//    }
//
//    public void printMatrix(int matrix[][]){
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        ArrayList catNames = new ArrayList();
//
//
//        String b = matrix.toString();
//        System.out.println(b);
//        //System.out.println(Arrays.toString(matrix[0]));
//    }
//
//
//
//
//    public static void main(String[] args)
//    {
//        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//
//        System.out.print("Input a line: ");
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        System.out.print("Input a second line: ");
//        String s2 = in.nextLine();
//
//
//        char[] X=s1.toCharArray();
//        char[] Y=s2.toCharArray();
//        int m = X.length;
//        int n = Y.length;
//
//        System.out.println("Length of LCS is" + " " +
//                lcs.lcs( X, Y, m, n ) );
//    }
//
//
//}
//
//
//// This Code is Contributed by Saket Kumar
//
