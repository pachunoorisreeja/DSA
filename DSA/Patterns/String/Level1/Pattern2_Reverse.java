package DSA.Patterns.String.Level1;

public class Pattern2_Reverse {
    public static void main(String[] args) {
        String s ="Sailo";
        reverseString(s);
        reverseEachWordInGivenString("Hello word!");
        reverseOrderOfWords("I love Java Coding");
        checkStringsReversed("abc","cba");
        reverseOnlyWordsInSentence("I am sreeja");
    }

    //6. Reverse a string (manual)
    public static void reverseString(String s){
        if (s == null || s.length()==0){
            System.out.println("null or empty");
            return;
        }
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("Reversed String is :"+rev);
    }

    //7. Reverse each word in a sentence
    public static void reverseEachWordInGivenString(String s){
        if (s == null || s.length()==0){
            System.out.println("null or empty");
            return;
        }
        String ss[] = s.split("\\s+");
        String rev = "";
        for(String word:ss){
            StringBuilder sb = new StringBuilder(word);
            rev +=sb.reverse().toString()+" ";
        }
        System.out.println("Reversed Sentence "+rev);
    }

    //8. Reverse order of words
    public static void reverseOrderOfWords(String s){
        if (s == null || s.length()==0){
            System.out.println("null or empty");
            return;
        }
        String words[] = s.split("\\s+");
        String reverse = "";
        for (int i=words.length-1;i>=0;i--){
            reverse+=words[i]+" ";
        }
        System.out.println("reversed one is :"+reverse.trim());
    }
    //9. Check if two strings are reverses
    public static void checkStringsReversed(String a, String b){

        StringBuilder sb = new StringBuilder(a);
        boolean flag = sb.reverse().toString().equals(b);
        System.out.println("isReversed "+flag);
    }
    public static void reverseOnlyWordsInSentence(String sentence){

        String ss[] = sentence.split(" ");
        String reverse = "";
        for (String s: ss){
            String temp = "";
            for (char c: s.toCharArray()){
                temp =c+temp;
            }
            reverse = reverse+temp+" ";

        }
        System.out.println("reverse sentence "+reverse);}
}
