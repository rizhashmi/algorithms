package com.personal.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 
import java.util.HashSet;
import java.util.Set;

class GFG { 
  
	   public static void main(String[] args) {

	        Student obj1 = new Student();
	        obj1.setName("mkyong");
	        obj1.addBook("Java 8 in Action");
	        obj1.addBook("Spring Boot in Action");
	        obj1.addBook("Effective Java (2nd Edition)");

	        Student obj2 = new Student();
	        obj2.setName("zilap");
	        obj2.addBook("Learning Python, 5th Edition");
	        obj2.addBook("Effective Java (2nd Edition)");

	        List<Student> list = new ArrayList<>();
	        list.add(obj1);
	        list.add(obj2);

	        List<String> collect =
	                list.stream()
	                        .map(x -> x.getBook())      //Stream<Set<String>>
	                        .flatMap(x -> x.stream())   //Stream<String>
	                        .distinct()
	                        .collect(Collectors.toList());

	        collect.forEach(System.out::println);
	    }
} 


class Student {

    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}
    
    //getters and setters

}