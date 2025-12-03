package DSA.Patterns.String.Level1;

public class Pattern1_Traversal{
    public static void main(String[] args) {
        String s ="Sreeja";
        printEachCharOfStr(s);
        System.out.println("Vowels COunt in "+s+" is :"+printVowelsInString(s));
        countUpperLowerDigitsSpecialChars("asj&6KL6^54");
        System.out.println("Count of Given Character Count :"+countFrequencyOfGivenChar("Sreeja",'e'));
        countWordsInSentence("I am sreeha, here there");
    }
    //1. Print each character of a string
    public static void printEachCharOfStr(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i)+" ");
        }
    }
    //2. Count vowels in a string
    public static int printVowelsInString(String s){
        int vowelCount =0;
        for(char c:s.toLowerCase().toCharArray()){
            if(c =='a' || c=='e' || c=='e' ||c=='i' || c=='o' || c=='u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }
    //3. Count uppercase, lowercase, digits, special characters
    public static void countUpperLowerDigitsSpecialChars(String s){
        int lowerCaseCount =0, upperCaseCount=0, digitsCOunt =0, specialCharacterCount =0;
        for(char c: s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isDigit(c)) {
                digitsCOunt++;
            } else {
                specialCharacterCount++;
            }

        }
            System.out.println("lowerCaseCount "+lowerCaseCount+" upperCaseCount "+upperCaseCount+" digitsCOunt "+digitsCOunt+" specialCharacterCount "+specialCharacterCount);
    }
    //4. Count frequency of a given character
    public static int countFrequencyOfGivenChar(String s, char c){
        int count =0;
        for(char cc:s.toCharArray()){
            if(cc==c)
                count++;
        }
        return count;
    }
    //5. Count words in a sentence
    public static void countWordsInSentence(String s){
        System.out.println("Words Count :"+s.split("\\s+").length);
    }
}
