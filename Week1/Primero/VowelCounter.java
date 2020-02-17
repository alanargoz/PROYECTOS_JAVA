public class VowelCounter {
     
    public static void main(String args[]) {
        String s = "azcbobobegghakl";
        int vowel_counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' )
            vowel_counter+=1;
                }
        System.out.print("Number of vowels: "+vowel_counter);
    }}