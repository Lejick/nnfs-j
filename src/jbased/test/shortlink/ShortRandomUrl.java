package jbased.test.shortlink;

import java.util.HashMap;
import java.util.Map;

public class ShortRandomUrl {
    public static String baseUrl = "http://short.com/";
    public static int DEFAULT_COUNT_DIGITS = 4;
    private int randomPathSize = DEFAULT_COUNT_DIGITS;

    Map<String, String> shortMap = new HashMap<>();

    public ShortRandomUrl() {
    }

    public ShortRandomUrl(int randomPathSize) {
        this.randomPathSize = randomPathSize;
    }

    String putSeoURL(String sourceUrl) {
        String generatedUrl = baseUrl + RandomSymbolsGenerator.generate(randomPathSize);
        shortMap.put(generatedUrl, sourceUrl);
        return generatedUrl;
    }

    String getLongUrl(String key) {
        return shortMap.get(key);
    }
}
