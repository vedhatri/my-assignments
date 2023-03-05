package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		int num=11 ;
		boolean isprime=true;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				isprime=false;
				break;
				}
			}
		if(isprime){
			System.out.println(num + "prime number");
		}
			else{
				System.out.println(num + "not prime number");
			}
		}
		
	}


