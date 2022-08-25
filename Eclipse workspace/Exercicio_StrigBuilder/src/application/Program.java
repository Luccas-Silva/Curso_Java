package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		
		Comment comment1 = new Comment("Have a nice trip!");
		Comment comment2 = new Comment("Wow that's awesome!");
		
		Post post1 = new Post(
				sdf.parse("21/06/2018"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!",
				12);
		
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		Comment comment3 = new Comment("Good night");
		Comment comment4 = new Comment("May the Force be with you");
		
		Post post2 = new Post(
				sdf.parse("28/07/2018"), 
				"Good night guys", 
				"See you tomorrow",
				5 );
		
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post1);
		System.out.println(post2);
		
		
		sc.close();

	}

}
