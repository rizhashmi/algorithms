package com.personal.test;
import java.util.stream.*;
import java.util.*;

public class StreamingTest {
	public static void main(String args[]){
		//list 1
		List<String> alphabets = Arrays.asList("A","B","C");
		//list 2
		List<String> names = Arrays.asList("Sansa","Jon","Arya");
		
			
		//creating two streams from the two lists and concatenating them into one
		Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());
			
		//displaying the elements of the concatenated stream
		opstream.forEach(str->System.out.print(str+" "));
		
		System.out.println(names.stream().map(d -> d.concat(":Processed")).anyMatch(x-> x.contains("Jon")));
		
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		System.out.println(number.stream().map(x->x*x).collect(Collectors.groupingBy(d-> d%2 ==0)));

		square.stream().filter(x->x%2==0).forEach(System.out::println);
		int even = square.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

		System.out.println(even);
		
		
		
	}
}
