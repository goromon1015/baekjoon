import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int [] arr = new int[8];
        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();           
        }
        
        String output =" ";
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] == arr[i+1]-1){
                output = "ascending";
            }
            else if (arr[i] == arr[i+1]+1){
                output = "descending";
            }
            else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}