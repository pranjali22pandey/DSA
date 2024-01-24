
//count occurances of  character
public class countCharacter {


    public static int countCharacterOfStr(String str , char c){

        int num = 0;

        for(int i = 0; i<(str.length()-1); i++){
            if(str.charAt(i)==c)
                num++;
        }

        return num ;

    }

public static void main (String args[]){
    String str ="Pranjali";
    char c = 'a';
    System.out.println(countCharacterOfStr(str, c));


}

}
