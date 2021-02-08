package jbased.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ShortRandomUrl {
    char[] seedChar = "ABCDEFG1234567890".toCharArray();

    Map<String, String> shortMap = new HashMap<>();
    String baseUrl = "http://short.com/";

    String putSeoURL(String sourceUrl) {
        Random rand = new Random();

        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = rand.nextInt(seedChar.length);
            code += seedChar[index];
        }
        shortMap.put(baseUrl + code, sourceUrl);
        return baseUrl + code;
    }

    String getLongUrl(String key) {
        return shortMap.get(key);
    }

}
