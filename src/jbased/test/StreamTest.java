package jbased.test;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    @Test
    public void test1() {
        List<String> ls = Arrays.asList("Foo", "Bar", "Buzz");
        List filteredList = ls.stream().filter((s) -> s.startsWith("B")).collect(Collectors.toList());
        filteredList.forEach(o -> System.out.println(o));
    }

    @Test
    public void test2() {
        List<String> ls = Arrays.asList("Foo", "Bar", "Buzz");

        List filteredList = ls.stream().
                map(s -> s.startsWith("B")).
                collect(Collectors.toList());

        filteredList.forEach(o -> System.out.println(o));
    }

    @Test
    public void test3() {
        List<String> ls = Arrays.asList("Foo", "Bar", "Buzz");

        List filteredList = ls.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.toList());

        filteredList.forEach(o -> System.out.println(o));
    }

    @Test
    public void test4() {
        String[] str = {"a,b,c"};
        String result = Arrays.stream(str).collect(Collectors.joining(","));
        System.out.println(result);
    }

}
