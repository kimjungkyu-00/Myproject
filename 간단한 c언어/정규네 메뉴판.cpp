#include "stdio.h"

bool Cash_Check(int price);

int totalCash = 0; // 누적금액 
int cash; // 결제금액 

int main()
{


   int menuBoard; // 메뉴판 
   int setMenu; // 선택메뉴 
   int foodMenu; // 음식메뉴  
   char o; 
	bool isbought = false;



   printf("================환영합니다================\n");
   printf("메뉴판을 확인하시겠습니까? Y/N : ");
   scanf("%c", &o);

   while (o == 'y' || o == 'Y')
   {
    
      printf("(1)정규육개장 = 8000\n(2)정규빈대떡 = 15000\n(3)정규소주 = 4000\n(4)정규맥주 = 4000\n(5)정규음료수 = 1000 \n");
      printf("무엇을 선택하시겠습니까?\n: ");
      scanf("%d", &setMenu);


      switch (setMenu)
      {
      case 1:
         printf("정규육개장은 8000원입니다. 돈주삼\n"); 
         isbought = Cash_Check(8000);
         break;
      case 2:
         printf("정규 빈대떡은 15000원 입니다. 돈주삼\n");
         isbought = Cash_Check(15000);
         break;
      case 3:
         printf("정규소주는 4000원입니다. 돈주삼\n");
         isbought = Cash_Check(4000);
         break;
      case 4:
         printf("정규맥주는 4000원입니다. 돈주삼\n");
         isbought = Cash_Check(4000);
         break;
      case 5:
         printf("정규음료수는 1000원입니다. 돈주삼\n");
         isbought = Cash_Check(1000);
         break;
         {
      default: printf("다시 입력하십시오\n");
      	break;
         }
     }
      
	     if (isbought)
		{
			printf("\n 감사합니다! \n");
			break;
		}

      } 

   }



    


bool Cash_Check(int price) 
{ 
	bool isbought=false;

   printf("돈을 넣어주세요.",price);
   scanf("%d", &cash);
   totalCash += cash;
   totalCash -= price;
    

   while (!isbought) {

      if (totalCash >= 0) { 
         printf("잔액은 %d입니다\n", totalCash);
		isbought=true;
      }
      else {
         printf("잔액이 부족합니다. 잔금을 더주세요.\n");
         scanf("%d", &cash);
         totalCash += cash;
      }

   }

   return isbought;

}
