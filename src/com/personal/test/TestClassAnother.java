package com.personal.test;
import java.util.function.Function;

public class TestClassAnother {

	
	
	public static void main(String args[]){
		RunnableForTest runnable = (x) -> { 
		    // your code here ... 
			System.out.println("Test here" + x );
		};
				
		runnable.run1(100);
		
		AdderInterface ai = (a,b) -> {
			return a + b;
		};
		
		method(ai);
		
		Student1 std = new Student1("Rizwan", 10);
		System.out.println(std.customShow((s)-> s.name + ":" + s.age));
	
	}
	
	public static void method(AdderInterface ai){
		System.out.println(ai.addNumbers(10, 10));
	}
}

class Student1 {
    public String name;
    public int age;
    public Student1(String name,int age){
        this.name = name;
        this.age = age;
    }
    public  String customShow(Function<Student1,String> fun){
        return fun.apply(this);
    }
}

@FunctionalInterface
interface AdderInterface {
	   int addNumbers(int a, int b);
	   
	   default int defaultMethod(int a, int b){
		   System.out.println("TEst Method");
		   return a+b;
	   }
}

