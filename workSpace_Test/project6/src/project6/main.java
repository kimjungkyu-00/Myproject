package project6;

public class main {

	public static void main(String[] args) {
		int sum=0;
		int min=100;
		int max=0;
		int[][] arr= {
				{10,20,30,40},
				{60,70,80,11},
				{22,33,44,55},
				{50,90,25,35} };
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i][i];
			
		}	
//		System.out.println(sum);
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j =0;j<arr[i].length;j++) {
				if(min > arr[i][j])
					min = arr[i][j];
				
				if(max < arr[i][j])
					max = arr[i][j];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}	
}