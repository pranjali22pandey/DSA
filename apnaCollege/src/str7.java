public class str7 {
    public static void Duplicate(String str){

        int[] count = new int[256];
        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)]++;

        }
        for(int i = 0 ; i<256;i++){
            System.out.println((char)(i)+ "count"+ count[i]);
        }


    }
}
