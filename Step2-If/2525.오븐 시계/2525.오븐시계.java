import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken()); 
        int B = Integer.parseInt(st.nextToken()); 
        
        int C = Integer.parseInt(br.readLine()); 

		br.close();
        
        int min = (A * 60) + B;
        
        min += C;
        
        int hour = (min / 60) % 24;
        int minute = min % 60;
		
        System.out.println(hour + " " + minute);

	}
}