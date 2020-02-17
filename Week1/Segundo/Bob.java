public class Bob {
     
    public static void main(String args[]) {
        String s = "iobooabobboboocbobobbbobobobb";
        int counter = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'o' && s.charAt(i+2) == 'b')
            counter+=1;
                }
        System.out.print("Number of times bob occurs is: "+counter);
    }}