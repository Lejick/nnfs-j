package jbased.test.shortlink;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
public class TestShort {

    @Test
    public void test_seo_word_put_1() {
        ShortUrl shortUrl = new ShortUrl();
        String result = shortUrl.putSeoURL("http://looooong.com/somepath ", "MY-NEW-WS");
        assertEquals("http://short.com/MY-NEW-WS", result);
    }

    @Test
    public void test_seo_word_put_2() {
        ShortUrl shortUrl = new ShortUrl();
        String result = shortUrl.putSeoURL("http://looooong.com/somepath", "POTATO");
        assertEquals("http://short.com/POTATO", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_seo_exceed_symbols() {
        ShortUrl shortUrl = new ShortUrl();
        shortUrl.putSeoURL(" http://looooong.com/1", "word1sfsadfsfddsfsafdsafsdfsfdsfsadfdsadfsadf");
    }


    @Test
    public void test_random_put() {
        ShortRandomUrl shortUrl = new ShortRandomUrl();
        String sourceUrl = "http://looooong.com/1";
        String key1 = shortUrl.putSeoURL(sourceUrl);
        assertEquals(sourceUrl, shortUrl.getLongUrl(key1));
    }

    @Test
    public void factory_generate_method() {
        AbstractUrlService shortUrl1 = new FactoryUrl().getInstance1();
        AbstractUrlService shortUrl2 = new FactoryUrl().getInstance2();
        String key1 = shortUrl1.putURL(" http://looooong.com/aaa");
        String key2 = shortUrl2.putURL(" http://looooong.com/bbb");
        assertEquals(shortUrl1.getLongUrl(key1), " http://looooong.com/aaa");
        assertEquals(shortUrl2.getLongUrl(key2), " http://looooong.com/bbb");
        assertEquals(shortUrl1.getBasedUrl() + "1", key1);
        assertEquals(shortUrl2.getBasedUrl() + "1", key2);

        key1 = shortUrl1.putURL(" http://looooong.com/aaa");
        key2 = shortUrl2.putURL(" http://looooong.com/bbb");
        assertEquals(shortUrl1.getLongUrl(key1), " http://looooong.com/aaa");
        assertEquals(shortUrl2.getLongUrl(key2), " http://looooong.com/bbb");
        assertEquals(shortUrl1.getBasedUrl() + "2", key1);
        assertEquals(shortUrl2.getBasedUrl() + "2", key2);
        assertEquals(shortUrl1.getLongUrl("word3"), null);

    }


}
