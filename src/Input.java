import java.util.Arrays;

public class Input {
    //public String line1;

  //  public String line2;

    public char[] line;


    public Input(char[] line) {
        this.line = line;
    }

    public int check(Input  first, Input second){
        int result = 0;
        int temp=0;
        int i,j =0;
        int jq;

        for (i=0; i< first.line.length; i++){
            for (j=0; j < second.line.length;j++){
                jq=j;
                if (first.line[i] == second.line[j]){
                   // temp++;
                        for (int iq= i; iq<(first.line.length-i);iq++){
                            if ((first.line[iq] == second.line[jq]) && (jq<second.line.length)){
                                temp++;
                                jq++;
                            }
                        }
                }
            }

//            if (first.line[i] == second.line[j]){
//                temp++;
//                for (int q=0; q < (second.line.length-j);q++){
//
//                }
            }


          //  j++;


        //System.out.println(result);

        return temp;
    }


    fuck this vegatable stock, id better wash my cock;

    public int check1(Input  first, Input second){
        int result = 0;
        int temp=0;
        int i,j =0;
        int jq;
        int _i, _j;

        for (i=0; i< first.line.length; i++) {
            for (j = 0; j < second.line.length; j++) { // этот цикл повторяется
                if (first.line[i] == second.line[j]){ // Нашел первую схожесть, ищу дальше
                    _i=i; // тут ошибка
                    _j=j;
                        do{
                            if (first.line[i] == second.line[j]) {
                                _j++;
                                _i++;
                                temp++;
                            }


                        }while (_j<4);


                }
            }
        }
        return temp;
    }

    public int step2(Input first, Input second, int pos1,  int pos2){
dasdadsads

    }




    @Override
    public String toString() {
        return "Input{" +
                "line=" + Arrays.toString(line) +
                '}';
    }
}
