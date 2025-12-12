package DSA.Patterns.String.Level1;

public class Pattern1_Traversal {
    public static void main(String[] args) {
        String s = "Sreeja";
        printEachCharOfStr(s);
        System.out.println("Vowels COunt in " + s + " is :" + printVowelsInString(s));
        countUpperLowerDigitsSpecialChars("asj&6KL6^54");
        System.out.println("Count of Given Character Count :" + countFrequencyOfGivenChar("Sreeja", 'e'));
        countWordsInSentence("I am sreeha, here there");
        countEachType("Hello Sreeja!123");
        countUpperCaseLowerCase("ghasSAI");
        convertUpperToLowerAndViceVersa("ghasSAI");
        printAsciiValues("aA ");

    }

    //1. Print each character of a string
    public static void printEachCharOfStr(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    //2. Count vowels in a string
    public static int printVowelsInString(String s) {
        int vowelCount = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    //3. Count uppercase, lowercase, digits, special characters
    public static void countUpperLowerDigitsSpecialChars(String s) {
        int lowerCaseCount = 0, upperCaseCount = 0, digitsCOunt = 0, specialCharacterCount = 0;
        for (char c : s.toCharArray()) {
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
        System.out.println("lowerCaseCount " + lowerCaseCount + " upperCaseCount " + upperCaseCount + " digitsCOunt " + digitsCOunt + " specialCharacterCount " + specialCharacterCount);
    }

    //4. Count frequency of a given character
    public static int countFrequencyOfGivenChar(String s, char c) {
        int count = 0;
        for (char cc : s.toCharArray()) {
            if (cc == c)
                count++;
        }
        return count;
    }

    //5. Count words in a sentence
    public static void countWordsInSentence(String s) {
        System.out.println("Words Count :" + s.split("\\s+").length);
    }

    //6. Count letters, digits, spaces, special characters
    public static void countEachType(String s) {
        int lettersCount = 0, digitCount = 0, specialCharsCount = 0, whitespaceCount = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isWhitespace(c)) {
                whitespaceCount++;
            } else {
                specialCharsCount++;
            }
        }
        System.out.println("lettersCount: " + lettersCount + " digitCount: " + digitCount + " specialCharsCount: " + specialCharsCount + " whitespaceCount: " + whitespaceCount);
    }

    public static void countUpperCaseLowerCase(String s) {
        int upperCase = 0, lowerCase = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            }
        }
        System.out.println("Upper case count: " + upperCase);
        System.out.println("Lower case count: " + lowerCase);
    }

    public static void convertUpperToLowerAndViceVersa(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toLowerCase(c));
            }else {
                sb.append(c);
            }
        }
        System.out.println("Rsult: "+sb.toString());
    }

    public static void printAsciiValues(String s){
        for (char c:s.toCharArray()){
            System.out.print("Ascii value of "+c+" is "+(int)c);
        }
        System.out.println();
    }
}
