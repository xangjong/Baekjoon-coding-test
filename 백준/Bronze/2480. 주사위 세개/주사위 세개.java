import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int max = 0;

		br.close();

		if (A == B && A == C && B == C) {
			System.out.println(10000 + (A * 1000));
		} else if (A == B || A == C) {
			System.out.println(1000 + (A * 100));
		} else if (B == C) {
			System.out.println(1000 + (B * 100));
		} else {
			if (A > B && A > C) {
				max = A;
				System.out.println(A * 100);
			} else if (B > C) {
				max = B;
				System.out.println(B * 100);
			} else if (C > B) {
				max = C;
				System.out.println(C * 100);
			}
		}

	}
}