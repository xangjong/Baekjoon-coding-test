import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] chessArr = {1, 1, 2, 2, 2, 8};
        
        for(int i=0; i<chessArr.length; i++){
            System.out.println(chessArr[i] - Integer.parseInt(st.nextToken()) + "");
        }
      
    }
}
