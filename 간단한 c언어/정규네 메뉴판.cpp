#include "stdio.h"

bool Cash_Check(int price);

int totalCash = 0; // �����ݾ� 
int cash; // �����ݾ� 

int main()
{


   int menuBoard; // �޴��� 
   int setMenu; // ���ø޴� 
   int foodMenu; // ���ĸ޴�  
   char o; 
	bool isbought = false;



   printf("================ȯ���մϴ�================\n");
   printf("�޴����� Ȯ���Ͻðڽ��ϱ�? Y/N : ");
   scanf("%c", &o);

   while (o == 'y' || o == 'Y')
   {
    
      printf("(1)���������� = 8000\n(2)���Ժ�붱 = 15000\n(3)���Լ��� = 4000\n(4)���Ը��� = 4000\n(5)��������� = 1000 \n");
      printf("������ �����Ͻðڽ��ϱ�?\n: ");
      scanf("%d", &setMenu);


      switch (setMenu)
      {
      case 1:
         printf("������������ 8000���Դϴ�. ���ֻ�\n"); 
         isbought = Cash_Check(8000);
         break;
      case 2:
         printf("���� ��붱�� 15000�� �Դϴ�. ���ֻ�\n");
         isbought = Cash_Check(15000);
         break;
      case 3:
         printf("���Լ��ִ� 4000���Դϴ�. ���ֻ�\n");
         isbought = Cash_Check(4000);
         break;
      case 4:
         printf("���Ը��ִ� 4000���Դϴ�. ���ֻ�\n");
         isbought = Cash_Check(4000);
         break;
      case 5:
         printf("����������� 1000���Դϴ�. ���ֻ�\n");
         isbought = Cash_Check(1000);
         break;
         {
      default: printf("�ٽ� �Է��Ͻʽÿ�\n");
      	break;
         }
     }
      
	     if (isbought)
		{
			printf("\n �����մϴ�! \n");
			break;
		}

      } 

   }



    


bool Cash_Check(int price) 
{ 
	bool isbought=false;

   printf("���� �־��ּ���.",price);
   scanf("%d", &cash);
   totalCash += cash;
   totalCash -= price;
    

   while (!isbought) {

      if (totalCash >= 0) { 
         printf("�ܾ��� %d�Դϴ�\n", totalCash);
		isbought=true;
      }
      else {
         printf("�ܾ��� �����մϴ�. �ܱ��� ���ּ���.\n");
         scanf("%d", &cash);
         totalCash += cash;
      }

   }

   return isbought;

}
