package jbased.test.shortlink;

import java.util.Random;

public class RandomSymbolsGenerator {
    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTYVWXYZ";
    private static String alphabetLow = alphabet.toLowerCase();
    private static String digits = "0123456789";
    private static char[] seedChar = (alphabet + alphabetLow + digits).toCharArray();

    public static String  generate(int count){
        Random rand = new Random();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < count; i++) {
            int index = rand.nextInt(seedChar.length);
            sb.append(seedChar[index]);
        }
        return sb.toString();
    }
}
