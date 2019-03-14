import java.util.Arrays;
import java.util.*;

//update

public class Input {
    //public String line1;

  //  public String line2;

    public char[] line;
    char[][] matrix = new char[10][10];


    public Input(char[] line) {
        this.line = line;
    }

    public void convertLine1(Input  first){
        for (int i=0; i<first.line.length;i++)
            matrix[0][i+1]= first.line[i];
    }

    public void convertLine2(Input second){
        for (int i=0; i<second.line.length;i++)
            matrix[i+1][0]= second.line[i];
    }


    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }





    @Override
    public String toString() {
        return "Input{" +
                "line=" + Arrays.toString(line) +
                '}';
    }
}
