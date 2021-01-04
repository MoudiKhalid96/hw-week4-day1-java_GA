package HomeWork;

public class Main {

	public static void main(String[] args) {
		
		
		//2
//		int x = 3;
//		int y = x;
//		
//		
//		System.out.println("Value of X = " + x);//OUTPUT: Value of X  = 3
//		System.out.println("Value of Y = " + y);//OUTPUT: Value of y  = 3
//		
//		System.out.println("Y has value of X");//OUTPUT: Y has value of X
//		
		
		
		//3
		double x;
		int y = 90;
		x = y/100;

		System.out.println("x="+x);//OUTPUT: x=0.0
		
		
		
		//4
//		int number = 7;
//	    boolean result = isPrime(number);
//	      
//	    System.out.println("Is " + number + " prime? " + result);
		
		//5
//		int number = 9;
//	      
//	      
//	      System.out.print("\n| ");
//	      for(int i=2 ; i<number ; i++){
//	          System.out.print((i)+" ");
//	      }
//	      
//	      System.out.println("\n|");
//	      
//	      for(int i=2 ; i<=number ; i++){
//	          
//	          System.out.print(i+"|");
//	        for(int j=2 ; j<=number ; j++){
//	            
//	            System.out.print(i*j + " ");
//	              
//	        }
//	        System.out.println();
//	      }
		
		
		
		//Optional Exercise
		
		
	}//end main method
	
	public static boolean isPrime(int number){
        //start with 2 .. because 1 will make it prime
        for(int i=2 ; i<number; i++){
            
            if(number % i == 0){
                return false;
            }
            
        }//end for loop
        
        return true;
    }//end method isPrime.
	
}//end class
