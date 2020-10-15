import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Linked_list{ 
  
    static class Node { 
        int data; 
        Node right; 
        Node down; 
    }; 
  
    static Node construct(int arr[][], int i, int j,  
                                     int m, int n) { 
          
       
        if (i > n - 1 || j > m - 1) 
            return null; 
 
        Node temp = new Node(); 
        temp.data = arr[i][j]; 
        temp.right = construct(arr, i, j + 1, m, n); 
        temp.down = construct(arr, i + 1, j, m, n); 
        return temp; 
    } 
  
 
    static void display(Node head) { 
          
        // pointer to move right 
        Node Rp; 
  
        // pointer to move down 
        Node Dp = head; 
  
        // loop till node->down is not NULL 
        while (Dp != null) { 
            Rp = Dp; 
  
    
        while (Rp != null) { 
         System.out.print(Rp.data + " "); 
         Rp = Rp.right; 
      } 
         System.out.println(); 
         Dp = Dp.down; 
       
        } 
    } 
  
  
    public static void main(String args[]) { 
    	 Scanner myObj = new Scanner(System.in);
   	  System.out.println("Enter rows");
   	  int m = myObj.nextInt();
   	  System.out.println("Enter coloumns");
   	  int n = myObj.nextInt();
   	  
   	  int sum=0;
   	  int sum2=0;
   	  
   	  Random rand = new Random();

   	  int[][] arr = new int[m][n];

   	  for(int i = 0; i<m; i++)
   	      for(int j = 0; j<n; j++)
   	         arr[i][j] = rand.nextInt((100 - 2) + 1) + 2;;
   	    
   	  
   	  for(int i = 0; i<m; i++)
   	  {
   	      for(int j = 0; j<n; j++)
   	      {
   	    	  
   	    	/*if (i == j) 
                sum += arr[i][j];
   	    	
   	    	
   	    	if ((i + j) == (n - 1)) 
                sum2 += arr[i][j]; */
   	    	//if(arr[i]==arr[j])
	        	//  sum+=arr[i][j];
   	    	
   	    	
   	    	
   	          //System.out.print(arr[i][j]+ "\t");
   	      }
   	    // System.out.println();
   	     
   	  }
   	  

      Node head = construct(arr, 0, 0, m, n); 
      display(head);     
   	  
   	 for (int i = 0, j =0; i< m && j < n; i++, j++) {
         sum= sum + arr[i][j];
         
      }
   	for (int i=0,j=n-1 ; i<m && j>=0 ; i++, j--) {
        sum2= sum2 + arr[i][j];
        
 }
     
     System.out.println("The sum of diagonal 1 is: "+ sum);
     System.out.println("The sum of diagonal 2 is: "+ sum2);
  
      if(sum*sum2>100) {
  	System.out.println("Harleen has survived this task");
  }  
        
        
    } 
  
} 

