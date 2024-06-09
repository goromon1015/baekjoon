import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for (int i=0; i<n; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        
        int min_x = x[0];
        int min_y = y[0];
        int max_x = x[0];
        int max_y = y[0];
 
        for(int i=0; i<n; i++){
            if(min_x > x[i]){
                min_x = x[i];
            }
            if(min_y > y[i]){
                min_y = y[i];
            }
            if(max_x < x[i]){
                max_x = x[i];
            }
            if(max_y < y[i]){
                max_y = y[i];
            }
        }
        if (n==1){
            System.out.println(0);
        }
        else{
        int x_length = max_x - min_x;
        int y_length = max_y - min_y;

        int size = x_length * y_length;

        System.out.println(size);
        }    
    }
}