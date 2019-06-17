package test5;

public class main {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int x=0;
		
		for (int i = 0; i < num.length; i++) {
			if(i%2==0) {
				for(int j=0;j<num.length;j++) {
					num[i][j] = ++x;
				}
			}else {
				for(int j=num[i].length-1;j>=0;j--) {
					num[i][j] = ++x;
				}
			}
		}
		
		 for(int i=0; i< num.length; i++) {
		        for(int j=0; j<num[i].length; j++) {
		           System.out.print(num[i][j] + " ");
		        }
		        System.out.println();
		     }
	}
}
