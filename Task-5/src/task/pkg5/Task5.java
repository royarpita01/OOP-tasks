/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg5;

/**
 *
 * @author fc
 */
public class Task5;
    public static void main(String[] args) {
        Scanner scan = new scanner(System.in);
        int n;
        System.out.print("Enter the number of elements: ");
        n=scan.nextInt();
        
        int a[]= new int[n];
        System.out.print("Enter the "+n+" of elements of the array: ");
        for(int i=0; i<n; i++){
            a[i]=scan.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int num=scan.nextInt();
        int p=0;
        for(int i=0; i<n; i++){
        if(num=a[i]){
            p++;
        }
    }
        System.out.print("Enter the "+n+" of elements of the array: ");
        
    
}
9