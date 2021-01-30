package jbased.test;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;


public class LambdaTest {
    UnaryOperator<Integer> f = i -> i == 0 ? 1 : i * this.f.apply(i - 1);

    @Test
    public void test1() {
        Comparator<Integer> cmp1 = (x, y) -> (x > y) ? 1 : (x < y) ? -1 : 0;
        Comparator<Integer> cmp2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        Comparator<Integer> cmp3 = Integer::compare;
        Consumer methodHandle;
        System.out.println();
    }

    @Test
    public void test2() {
        Record r = new Record();
        r.x = 1;
        Consumer<Record> consumer = r1 -> r1.x = 9;
        consumer.accept(r);
        System.out.println(r.x);
    }

    @Test
    public void test3() {
        f.apply(4);
    }

    @Test
    public void test4() {
        BiFunction<String, Integer, Character> stringIntegerCharacterBiFunction = String::charAt;
        System.out.println(stringIntegerCharacterBiFunction.apply("ttttt", 2));
        Predicate<String> ew = "ttttt"::endsWith;
        System.out.println(ew.test("t"));
    }

    @Test
    public void test5() {
        String str = "123";
        Integer res = Arrays.stream(str.split("")).map((x) -> Integer.valueOf(x)).reduce(0, Integer::sum);
        System.out.println(res);
    }
    @Test
    public void test6() {
        AtomicInteger counter=new AtomicInteger();
        ThreadLocal<Integer> tli=ThreadLocal.withInitial(() -> counter.incrementAndGet());
        Assert.assertEquals(tli.get(), (Integer) 1);
        Assert.assertEquals(tli.get(), (Integer) 1);
        Assert.assertEquals(tli.get(), (Integer) 1);
        tli=ThreadLocal.withInitial(counter::incrementAndGet);
        Assert.assertEquals(tli.get(), (Integer) 2);
    }
    @Test
    public void test7() {

    }
}
