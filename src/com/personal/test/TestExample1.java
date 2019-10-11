package com.personal.test;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.*;
public class TestExample1 {
	
    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        //Stream<String>, GOOD!
        Supplier<Stream<String>> stringStream = () -> Arrays.stream(data).flatMap(x -> Arrays.stream(x));
        stringStream.get().forEach(System.out::println);
        
        Stream<String> stream = stringStream.get().filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

		/*Stream<String> stream = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));*/

    }
}
