package test7;

public class main {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int x = 1;
		int check = 1;
		int start= 0;
		int end = 4;
		

		for(int i=0; i<num.length;i++) {
			for(int j=start;j!=end+check;j+=check) 
			{
				num[i][j] = x++;
			}
			int tmp=start;
			start =end;
			end=tmp;
			check=check*-1;
			
		}
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				System.out.print(num[i][j] + " ");
			}System.out.println();
		}
		
		
		}
	}


