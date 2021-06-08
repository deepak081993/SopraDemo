package looping;

public class ForLoop_Example {
	/*
	 The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.
	 
	 There are three types of for loops in java.

		Simple For Loop
		For-each or Enhanced For Loop
		Labeled For Loop
		
	 */
	public void ForExample() {
		for(int i=1;i<=10;i++){ 
	        System.out.println(i);  
	    }  
	}
	
	//ForEachExample 
	
	public void ForEachExample() {
		//Declaring an array  
	    int arr[]={12,23,44,56,78};  
	    //Printing array using for-each loop  
	    for(int i:arr){  
	        System.out.println(i);  
	    }  
	}
	
	public static void main(String[] args) {
		ForLoop_Example example=new ForLoop_Example();
		example.ForExample();
		example.ForEachExample();
	}
}
