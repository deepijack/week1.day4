package week.day4;

public class Boolean {

	public static void main(String[] args) {
		int inp=13;
		boolean flag=false;
		for(int i=2;i<=inp-1;i++) {
			if(inp%i==0) {
				flag=true;
				System.out.println("not prime");
			}
		}
		if(!flag) {
			System.out.println("given number is prime");
		}else {
			System.out.println("given number is not prime");
		}
		
	}

}
