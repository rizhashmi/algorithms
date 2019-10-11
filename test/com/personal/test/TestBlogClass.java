package com.personal.test;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
import java.util.*;
import java.util.stream.*;


public class TestBlogClass {
	@Test
	public void givenListOfBlogs_whenAuthorName_thenMapAuthorWithComments() {
	    Blog blog1 = new Blog("Riz", "Nice", "Very Nice");
	    Blog blog2 = new Blog("darling", "Disappointing", "Ok", "Could be better");
	    List<Blog> blogs = List.of(blog1, blog2);
	    //blogs.add(new Blog("",""));
	         
	    Map<String,  List<List<String>>> authorComments1 = blogs.stream()
	     .collect(Collectors.groupingBy(Blog::getAuthorName, 
	       Collectors.mapping(Blog::getComments, Collectors.toList())));
	    
	    Map<String,  List<Blog>> authorCommentsBlog = blogs.stream()
	   	     .collect(Collectors.groupingBy(Blog::getAuthorName));
	        
	    assertEquals(2, authorComments1.size());
	    assertEquals(2, authorComments1.get("Riz").get(0).size());
	    assertEquals(3, authorComments1.get("darling").get(0).size());
	 
	    Map<String, List<String>> authorComments2 = blogs.stream()
	      .collect(Collectors.groupingBy(Blog::getAuthorName, 
	        Collectors.flatMapping(blog -> blog.getComments().stream(), 
	        Collectors.toList())));
	 
	    assertEquals(2, authorComments2.size());
	    assertEquals(2, authorComments2.get("Riz").size());
	    assertEquals(3, authorComments2.get("darling").size());
	}
	public static void main(String args[]) {
		Map<Integer, String> random = new HashMap<Integer, String>();

		random.put(1,"z");
		random.put(6,"k");
		random.put(5,"a");
		random.put(3,"f");
		random.put(9,"c");

		Map<Integer, String> sortedMap =
		        random.entrySet().stream()
		                .sorted(Map.Entry.comparingByValue())
		                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                        (e1, e2) -> e2, LinkedHashMap::new));
		
		System.out.println("Sorted Map: " +
				random.entrySet().stream().sorted((e1,e2) -> e1.getValue().compareTo(e2.getValue())).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new)));
		
		System.out.println("Sorted Map: " + Arrays.toString(sortedMap.entrySet().toArray()));

	}

}
