package jbased.test.shortlink;

import java.util.HashMap;
import java.util.Map;

public class ShortUrl {
    Map<String, String> shortMap = new HashMap<>();
    String baseUrl = "http://short.com/";

    void putSeoURL(String sourceUrl, String seoWord) {
        shortMap.put(baseUrl + seoWord, sourceUrl);
    }

    String getLongUrl(String key) {
        return shortMap.get(key);
    }

}
