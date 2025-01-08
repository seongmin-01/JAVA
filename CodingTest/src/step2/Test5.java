package step2;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45;
        
        if (m < 0) {
            m += 60;  
            h--;        
            if (h < 0) {
                h = 23;  
            }
        }
        
        // 결과 출력
        System.out.println(h + " " + m);
	}
}
