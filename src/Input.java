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

    public void check1(Input first, Input second){
        char match='0';
        System.out.println(first.line.length);
//        if (matrix[1][0]== matrix[0][1]){
//            matrix[1][1]=match;
//        }
//        if (matrix[1][0]== matrix[0][2]){
//            matrix[1][2]=match;
//        }
//        // вторая строка
//        if (matrix[2][0]== matrix[0][1]){
//            matrix[2][1]=match;
//        }
//        if (matrix[2][0]== matrix[0][2]){
//            matrix[2][2]=match;
//        }

        ////////
//        if (matrix[0][1] == matrix[1][0]){
//            matrix[1][1]=match;
//        }
//
//        if (matrix[0][1] == matrix[2][0]){
//            matrix[2][1]=match;
//        }
//
//        if (matrix[0][1] == matrix[3][0]){
//            matrix[3][1]=match;
//        }
        //////////
        // i = остается тот же, это строка слева
        int j=1;// для вставки матч
        int i1=0;
        int i2=1;
        ////



//        for (int i=1; i<=5;i++){
//            if (matrix[i1][i2] == matrix[i][0]){
//                matrix[j][1]=match;
//            }
//            j++;
//        }
//        i1=0;
//        i2=2;// увеличивается каждый цикл на 1
//        j=1; //всегда  начинается с 1
//        for (int i=1; i<=5;i++){
//            if (matrix[i1][i2] == matrix[i][0]){
//                matrix[j][2]=match;
//            }
//            j++;
//        }


        ///

        int ma=0;
        for (int ch=0;ch<5;ch++){
            j=1;
            ma++;
            for (int i=1; i<=5;i++){
                if (matrix[i1][i2] == matrix[i][0]){
                    matrix[j][ma]=match;
                }
                j++;
            }
            i2++;

        }


    }

    public void check(Input first, Input second){
        char match='0';
        System.out.println(first.line.length);
        for (int i=1; i< first.line.length;i++){
            for (int j=1; j<= second.line.length;j++){
                if (first.line[i]==second.line[j-1]){
                    matrix[i][j]=match;
                }

            }
        }
    }





    @Override
    public String toString() {
        return "Input{" +
                "line=" + Arrays.toString(line) +
                '}';
    }
}
