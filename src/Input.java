/**
 * Roman Makeev, for Gdansk University
 */

class Input {

    private final char[] X;
    private final char[] Y;

    public Input(char[] x, char[] y) {
        X = x;
        Y = y;
    }

    /**
     * @return - length of lcs
     */

     public int lcs()
    {
        int[][] L = new int[X.length + 1][Y.length + 1];

        for (int i=0; i<=X.length; i++)
        {
            for (int j=0; j<=Y.length; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                 L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
                //print
            }
            printMatrix(L);

        }
        printlcs(L);

        return L[X.length][Y.length];
    }

    /**
     * Copy
     * @param matrix - matrix [+1][+1]
     */

    private void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");


    }
    //

    /** Took from geeksforgeeks.org
     *
     * @param L matrix [+1][+1]
     */

    private void printlcs(int[][] L) {
        int index = L[X.length][Y.length];
        int temp = index;

        char[] lcs = new char[index + 1];
        lcs[index] = ' ';
        int i = X.length, j = Y.length;

        while (i > 0 && j > 0) {

            if (X[i - 1] == Y[j - 1]) {
                lcs[index - 1] = X[i - 1];
                i--;
                j--;
                index--;
            }
            else if (L[i - 1][j] > L[i][j - 1])
                i--;
            else
                j--;
        }

        System.out.print("LCS of "+toString(X)+" and "+toString(Y)+" is: ");

        for(int k=0;k<=temp;k++)
            System.out.print(lcs[k]);
        System.out.println();
    }

    /**
     * From char array to String
     * @param temp_char - for converting
     * @return - String value
     */

    @SuppressWarnings("UnnecessaryLocalVariable")
    private String toString(char[] temp_char) {
        String temp_string = new String(temp_char);
        return  (temp_string);
    }
}
