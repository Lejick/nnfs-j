package jbased.test.shortlink;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestShort {

    @Test
    public void test_seo_word_put() {
        ShortUrl shortUrl = new ShortUrl();
        String result = shortUrl.putSeoURL(" http://looooong.com/1", "word1");
        Assert.assertEquals(shortUrl.baseUrl + "word1", result);
    }

    @Test
    public void test_random_put() {
        ShortRandomUrl shortUrl = new ShortRandomUrl();
        String sourceUrl = "http://looooong.com/1";
        String key1 = shortUrl.putSeoURL(sourceUrl);
        Assert.assertEquals(sourceUrl, shortUrl.getLongUrl(key1));
    }

    @Test
    public void test3() {
        AbstractUrlService shortUrl1 = new FactoryUrl().getInstance1();
        AbstractUrlService shortUrl2 = new FactoryUrl().getInstance2();
        String key1 = shortUrl1.putURL(" http://looooong.com/aaa");
        String key2 = shortUrl2.putURL(" http://looooong.com/bbb");
        Assert.assertEquals(shortUrl1.getLongUrl(key1), " http://looooong.com/aaa");
        Assert.assertEquals(shortUrl2.getLongUrl(key2), " http://looooong.com/bbb");
        Assert.assertEquals(shortUrl1.getBasedUrl() + "1", key1);
        Assert.assertEquals(shortUrl2.getBasedUrl() + "1", key2);

        key1 = shortUrl1.putURL(" http://looooong.com/aaa");
        key2 = shortUrl2.putURL(" http://looooong.com/bbb");
        Assert.assertEquals(shortUrl1.getLongUrl(key1), " http://looooong.com/aaa");
        Assert.assertEquals(shortUrl2.getLongUrl(key2), " http://looooong.com/bbb");
        Assert.assertEquals(shortUrl1.getBasedUrl() + "2", key1);
        Assert.assertEquals(shortUrl2.getBasedUrl() + "2", key2);

        Assert.assertEquals(shortUrl1.getLongUrl("word3"), null);
    }


}
