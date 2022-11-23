import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        
        if( X > 0 ) {
        	if(Y > 0 ) {
        		System.out.println(1);
        	} else {
        		System.out.println(4);
        	}
        } else {
        	if(Y>0) {
        		System.out.println(2);
        	} else {
        		System.out.println(3);
        	}
        }
      
    }
}