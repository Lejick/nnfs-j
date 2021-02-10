package jbased.test.shortlink;

import java.util.HashMap;
import java.util.Map;

public class FactoryUrl {

    public AbstractUrlService getInstance1() {
        return new UrlServiceImpl1();
    }

    public AbstractUrlService getInstance2() {
        return new UrlServiceImpl2();
    }
}

class UrlServiceImpl1 extends AbstractUrlService {
    String baseUrl = "http://short1.com/";
    protected static volatile int index = 1;

    @Override
    public String getBasedUrl() {
        return baseUrl;
    }

    @Override
    protected synchronized int getNextIndex() {
        return index++;
    }
}

class UrlServiceImpl2 extends AbstractUrlService {
    protected static volatile int index = 1;
    String baseUrl = "http://short2.com/";

    @Override
    protected synchronized int getNextIndex() {
        return index++;
    }

    @Override
    public String getBasedUrl() {
        return baseUrl;
    }
}

abstract class AbstractUrlService {

    protected Map<String, String> shortMap = new HashMap<>();

    protected abstract String getBasedUrl();

    protected String putURL(String sourceUrl) {
        String key = getBasedUrl() + getNextIndex();
        shortMap.put(key, sourceUrl);
        return key;
    }

    protected abstract int getNextIndex();

    protected String getLongUrl(String key) {
        return shortMap.get(key);
    }

}