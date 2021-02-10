package jbased.test.shortlink;

import java.util.HashMap;
import java.util.Map;

public class ShortUrl {
    Map<String, String> shortMap = new HashMap<>();
   public String baseUrl = "http://short.com/";

    public String putSeoURL(String sourceUrl, String seoWord) {
        String key = baseUrl + seoWord;
        shortMap.put(key, sourceUrl);
        return key;
    }

    public String getLongUrl(String key) {
        return shortMap.get(key);
    }

}
