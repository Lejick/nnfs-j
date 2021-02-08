package jbased.test.shortlink;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestShort {


    @Test
    public void test1() {
        ShortUrl shortUrl = new ShortUrl();
        shortUrl.putSeoURL(" http://looooong.com/1", "word1");
        shortUrl.putSeoURL(" http://looooong.com/2", "word2");
        Assert.assertEquals(shortUrl.getLongUrl(shortUrl.baseUrl + "word1"), " http://looooong.com/1");
        Assert.assertEquals(shortUrl.getLongUrl(shortUrl.baseUrl + "word2"), " http://looooong.com/2");
        Assert.assertEquals(shortUrl.getLongUrl(shortUrl.baseUrl + "word3"), null);
    }

    @Test
    public void test2() {
        ShortRandomUrl shortUrl = new ShortRandomUrl();
        String key1 = shortUrl.putSeoURL(" http://looooong.com/1");
        String key2 = shortUrl.putSeoURL(" http://looooong.com/2");
        Assert.assertEquals(shortUrl.getLongUrl(key1), " http://looooong.com/1");
        Assert.assertEquals(shortUrl.getLongUrl(key2), " http://looooong.com/2");
        Assert.assertEquals(shortUrl.getLongUrl(shortUrl.baseUrl + "word3"), null);
    }



}
