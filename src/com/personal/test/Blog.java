package com.personal.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Blog {
    private String authorName;
    private List<String> comments;
	
    public Blog(String authorName, String... comments) {
		super();
		this.authorName = authorName;
		
		this.comments = Arrays.asList(comments);
    }



	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
    
    
       
    // constructor and getters
}