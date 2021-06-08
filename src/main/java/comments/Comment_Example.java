package comments;

public class Comment_Example {

	
	/**The Java comments are the statements that are not executed by the compiler and interpreter.
	  The comments can be used to provide information or explanation about the variable,
	   method, class or any statement. It can also be used to hide program code.*/
	
	
	public void singleLineComment() {
		int i=10;//Here, i is a variable  
	    System.out.println(i);  
	}
	
	public void multiLineComment() {
		/* Let's declare and 
		 print variable in java. */  
		    int i=10;  
		    System.out.println(i);  
	}
	
	public int documentationComment(int a, int b) {
		/** The add() method returns addition of given numbers.*/  
		{return a+b;}  
	}
	
	public static void main(String[] args) {
		Comment_Example example=new Comment_Example();
		example.singleLineComment();
		example.multiLineComment();
		example.documentationComment(5, 10);
	}
}
