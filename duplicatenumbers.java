package week1.day2;

public class duplicatenumbers {

	public static void main(String[] args) {
		int[] nums= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = nums.length;
		int count=0;
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
					System.out.println(nums[i]);
				}
				
				}}}}
			
		

	


