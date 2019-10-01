public class countOccurrences {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        char character = 'l';
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == character){
                count ++;
        }
        }
        System.out.print("Occurrences of character ' l ' in string is " + count);
    }
}
