package jbased.test;

import java.lang.invoke.MethodHandle;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;


public class LambdaTest {
    @org.junit.jupiter.api.Test
    public void test1() {
        Comparator<Integer> cmp1 = (x, y) -> (x > y) ? 1 : (x < y) ? -1 : 0;
        Comparator<Integer> cmp2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        Consumer methodHandle;
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void test2() {
        Record r = new Record();
        r.x = 1;
        Consumer<Record> consumer = r1 -> r1.x = 9;
        consumer.accept(r);
        System.out.println(r.x);
    }

    @org.junit.jupiter.api.Test
    public void test3() {
        int start = 0;
        IntUnaryOperator iua;
        //   System.out.println(r.x);
    }

}
