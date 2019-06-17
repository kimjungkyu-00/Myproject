package project12;


import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.security.auth.callback.ChoiceCallback;

public class main { 
	public static void main(String[] args) 
	{
		int[] Gray;
		int[] Binary;

		Scanner scanner = new Scanner(System.in);

		while(true)
		{
			System.out.println("1. 2진수 -> 그레이코드");
			System.out.println("2. 그레이코드 -> 2진수");
			System.out.println("3. 종료");

			int check = scanner.nextInt();
			if(check==1)
			{
				boolean valuecheck = true;
				System.out.print("2진수를 입력해주세요.:");
				String twoValue=scanner.next();
				Binary = new int[twoValue.length()];//
				Gray = new int[twoValue.length()];//
				for(int i = 0;i<Binary.length;i++)
				{
					Binary[i]=Character.getNumericValue(twoValue.charAt(i));
					if(!(Binary[i] == 0 || Binary[i] == 1))//
						valuecheck = false;
				}

				if(valuecheck)
				{
					Gray[0] = Binary[0];

					for(int i = 1;i<Binary.length;i++)
					{
						if(Binary[i-1] + Binary[i] == 2 || Binary[i-1] + Binary[i] == 0)
							Gray[i] = 0;
						else
							Gray[i] = 1;
					}

					for(int j = 0;j<Gray.length;j++)
						System.out.print(Gray[j]);
					System.out.println();
				}
				else
				{
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
			}
			else if(check==2)
			{
				boolean valuecheck = true;
				System.out.print("그레이코드를 입력해주세요. :");
				String gray=scanner.next();
				Binary = new int[gray.length()];
				Gray = new int[gray.length()];
				for(int i = 0;i<Gray.length;i++)
				{
					Gray[i]=Character.getNumericValue(gray.charAt(i));
					if(!(Gray[i] == 0 || Gray[i] == 1))
						valuecheck = false;
				}

				if(valuecheck)
				{
					Binary[0] = Gray[0];

					for(int i = 1;i<Binary.length;i++)
					{
						if(Gray[i] + Binary[i-1] == 2 || Gray[i] + Binary[i-1] == 0)
							Binary[i] = 0;
						else
							Binary[i] = 1;
					}

					for(int j = 0;j<Binary.length;j++)
						System.out.print(Binary[j]);
					System.out.println();
				}
				else
				{
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
			}
			else
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
	
	
	
}
