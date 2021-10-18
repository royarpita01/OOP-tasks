package task_02;
        import java.util.Scanner;
       public class Task_02 {
    private static Scanner sc;
    public static void main(String[] args) {
        int n,i=0,j=0;
        int pos_count = 0, neg_count = 0;
        sc = new Scanner(System.in);
        System.out.print("Input the number of elements in an array : ");
		n = sc.nextInt();	
		int [] a = new int[n];
		System.out.print("Enter " + n + " elements of an Array  : ");
		while (i < n){
			a[i] = sc.nextInt();
                        i++;
		}   
                while (j < n){
			if(a[i] >= 0){
				pos_count++;
			}
			else{
				neg_count++;
			}
                        j++;
		}		
		System.out.println("\n Positive Numbers = " + pos_count);
		System.out.println("\n Negative Numbers = " + neg_count);
	}
       }
   }
 }
