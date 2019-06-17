import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		
		List<Integer> list = new ArrayList<Integer>();
		int num; // 숫자 저장할 배열
		int max;
		int min;
		int mincheck=0;
		int maxcheck=0;
		
    
       System.out.println("숫자를 입력 = ");

       num= sc.nextInt();
       list.add(num);
			while( num != 0) {
				num= sc.nextInt();
			       list.add(num);       
			}
			
			max = list.get(0);
			min = list.get(0);
			for(int i=1; i<list.size();i++) {
				
				 if( min > list.get(i)  && list.get(i) !=0) {
	                    min = list.get(i);
	                    mincheck = i;
	              }
				 if(max < list.get(i)) {
					 max = list.get(i);
					 maxcheck=i;
				 }
				 
				
			}
			System.out.println("최소값 : "+min+"몇번째 자리 :"+(mincheck+1));
			System.out.println("최대값 : "+ max+"몇번째 자리 :"+(maxcheck+1));

		

	}

}
