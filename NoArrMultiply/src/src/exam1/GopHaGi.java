package exam1;

public class GopHaGi {

	public static void main(String[] args) {
		exam1();
		exam2();
		exam3();
		
	}
	
	// 구구단 3단에서 4의 배수를 제외한 나머지를 출력하시오
	public static void exam1() {
		System.out.println("\n 1번문제");
		int a = 3;
		for(int i = 1; i <= 9; i++) {
			
			if(i%4!=0)
			System.out.println(a + "*" + i + "=" + a*i);
		}
	}
	
	// 1부터 100까지의 합을 구하시오
	public static void exam2() {
		System.out.println("\n 2번문제");
		int j = 0;
		for(int i = 1; i<=100 ; i++) {
			j += i;
			
		}
		System.out.println(j);
		
	}
	
	// 구구단 2~9단까지 3의 배수 단은 포함하지 않는다
	public static void exam3() {
		System.out.println("\n 3번문제");
		for(int i = 2 ; i <= 9 ; i++) {
			if(i % 3 != 0) {
				System.out.println(i+"단");
				for(int j = 1; j <= 9 ; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}
		
		
	}

}
