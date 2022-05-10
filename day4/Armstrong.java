package week.day4;

public class Armstrong {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int temp;
		int result;
		for(int num=100;num<=999;num++) {
			temp=num;
			c=temp%10;
			temp=temp/10;
			b=temp%10;
			temp=temp/10;
			a=temp%10;
			temp=temp/10;
			result=(a*a*a)+(b*b*b)+(c*c*c);
					if(num==result)
					{
						System.out.println(num+"is arms");
					}
					
		}

	}

}
