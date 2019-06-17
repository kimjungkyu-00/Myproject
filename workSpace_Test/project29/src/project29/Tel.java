package project29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.security.auth.callback.ChoiceCallback;

class Data{
   String name;
   String number;
   String address;
   String email;
}
public class Tel { 
   public static void main(String[] args) throws IOException 
   {
      
      List<Data> phonbook = new ArrayList<>(); 
      
      String s = "C:\\source\\workspace_network\\project29\\src\\project29\\out.txt";
      
      
      try{
            //파일 객체 생성
            File file = new File(s);
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                String[] divString=line.split(" ");
                Data d = new Data();
            d.name = divString[0];
            d.number = divString[1];
            d.address = divString[2];
            d.email = divString[3];
            phonbook.add(d);
            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.            
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }      
      
      ////////////////////////////////////////////////////////
      //처음 실행 txt 파일과 List 연결작업

      Data temp = new Data();   
      String text;


      while(true)
      {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("1. 저장");
         System.out.println("2. 삭제");
         System.out.println("3. 전체리스트 보기");
         System.out.println("4. 변경");
         System.out.println("5. 종료");
         
         int key = br.read()-48; // br.read()->char->유니코드

         ////////////////////////////////////////////////
         //키입력으로 1,2,3,4,5분기전에 입력받기
         
         
         if(key == 5)
         {
            System.out.println("프로그램 종료!!!");
            break;
         }

         switch (key) {
         case 1:
            Scanner scan1 = new Scanner(System.in);
            System.out.println("입력하세요 : ");
            String[] valueAll=scan1.nextLine().split(" ");

            fileWrite(s, valueAll);
            
            Data d = new Data();
            d.name = valueAll[0];
            d.number = valueAll[1];
            d.address = valueAll[2];
            d.email = valueAll[3];
            phonbook.add(d);
            break;
         case 2:
            Scanner scan2 = new Scanner(System.in);
            System.out.println("이름을 입력해시요 : ");
            text = scan2.next();         
            for(Data value : phonbook)
            {
               if(value.name.equals(text))
               {
                  temp = value;
               }
            }
            phonbook.remove(temp);
            
            fileRewrite(phonbook,s);
            
            break;
         case 3:
            for(Data value : phonbook)
            {
               System.out.printf("이름 : %s 전화번호 : %s 주소 : %s 이메일 : %s %n", value.name,value.number,value.address,value.email);
            }
            break;
         case 4:
            Scanner scan6 = new Scanner(System.in);
            System.out.println("이름를 입력해시요 : ");
            text = scan6.next();
            int count = 0;
            for(Data value : phonbook)
            {
               
               if(value.name.equals(text))
               {
                  Scanner scan7 = new Scanner(System.in);
                  System.out.print("이름 전화번호 주소 이메일을 입력해주세요 :");
                  valueAll = scan7.nextLine().split(" ");
                  temp.name = valueAll[0];
                  temp.number = valueAll[0];
                  temp.address = valueAll[0];
                  temp.email = valueAll[0];
                  
                  phonbook.set(count, temp);
                  //phonebook 최신화 
                  
                  fileRewrite(phonbook,s);
                  
                  break;
                  
               }
               count++;
            }
            if(phonbook.size() == count)
               System.out.println("이름확인 부탁드립니다.");
            break;
         default:
            System.out.println("잘못된 값입니다.");
            break;
         }

      }
   }
   
   public static void fileWrite(String s, String[] valueAll) throws IOException
   {
      BufferedWriter out = new BufferedWriter(new FileWriter(s,true));
      
      out.write(valueAll[0]+" "+valueAll[1]+" "+valueAll[2]+" "+valueAll[3]);
      out.newLine();
      out.close();
   }
   
   public static void fileRewrite(List<Data> a, String s) throws IOException
   {
      BufferedWriter delout = new BufferedWriter(new FileWriter(s));
      //초기화
      for(Data value : a)
      {
         String vtemp = value.name+" "+value.number+" "+value.address+" "+value.email;
         delout.write(vtemp);
         delout.newLine();   
      }
      delout.close();
   }
}


