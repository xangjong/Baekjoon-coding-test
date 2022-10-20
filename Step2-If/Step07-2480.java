import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int Z = Integer.parseInt(st.nextToken());
		int max = 0;

		br.close();

		if ((X == Y) && (Y == Z) && (X == Z)) {
			System.out.println(10000 + (X * 1000));
		} else if ((X == Y) || (X == Z)) {
			System.out.println(1000 + (X * 100));
		} else if (Y == Z) {
			System.out.println(1000 + (Y * 100));
		} else {
			if ((X > Y) && (X > Z)) {
				max = X;
				System.out.println(X * 100);
			} else if (Y > Z) {
				max = Y;
				System.out.println(Y * 100);
			} else if (Z > Y) {
				max = Z;
				System.out.println(Z * 100);
			}
		}

	}
}