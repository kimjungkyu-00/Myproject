package snail2;

public class main {

	public static void main(String[] args) {
/*
			 1 	2 	3 	4 	5
			16	17	18	19	6
			15	24	25	20	7
			14	23	22	21	8
			13	12	11	10	9	
*/
		int start=0;
		int end =4;
		int check=1;
		int x=1;
		int[][] num = new int[5][5];
		for(int i=0;i<=4;i++ ) {
			for(int j=start;j<=end;check++) {
				num[i][j] =	x++;
				
				System.out.print(num[i][j]);
			}System.out.println();
//			for(int j=end;j>=0;j++) {
//				
//			}
			
		}
		
		
		
	}
}