package tset9;

public class mmain {

	public static void main(String[] args) {
		
		int arrSize=5;
		int[][] arr=new int[arrSize][arrSize];
		int r=0; //행
		int c=-1; // 열
		int k=arrSize; //반복횟수
		int sw=1; //증감
		int n=1; //값
		
		while(true) {
		for(int i=0;i<k;i++) { // 행고정 열변화
			c+=sw;
			arr[r][c] = n++;
		}
		k--;
		if(k==0) {
			break;
		}
		for(int j=0;j<k;j++) {
			r+=sw;
			arr[r][c] = n++;
		}
		
		}
		
		
		
	}

}
