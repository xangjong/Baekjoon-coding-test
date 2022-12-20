import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());

        int max = a;
        int min = a;
        
        for(int i = 1; i < n; i++){
            a = Integer.parseInt(st.nextToken());
            
            if(a > max){
                max = a;
            } 
            if( a < min){
                min = a;
            }
        }
        
        System.out.print(min + " " + max);
    }
}