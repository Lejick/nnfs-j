package jbased.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void test3() {
        Point x = new Point(0, 0);
        Point a = new Point(1, 1);
        Point b = new Point(-1, 0);
        Point c = new Point(2, 1);
        List<Point> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        List<Point> resultList = KClosest.find(list, x, 2);
        System.out.println();
    }

}
