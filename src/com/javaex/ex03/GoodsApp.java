package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       List<Goods> gList = new ArrayList<Goods>();
       int result = 0;
       
       System.out.println("상품을 입력해주세요(종료 q)");
       
       while(true) {
    	   String str = sc.nextLine();
    	   String[] data = str.split(",");
    	   
    	   if(str.equals("q")) {
    		   System.out.println("[입력완료]");
    		   System.out.println("=================================");
    		   break;
    	   }
    	   
    	   String name = data[0];
    	   int price = Integer.parseInt(data[1]); //String -> int
    	   int count = Integer.parseInt(data[2]);
    	   
    	   Goods gs = new Goods(name, price, count);
    	   
    	   gList.add(gs);   
    	   
       }
       
       for(int i=0; i<gList.size(); i++) {
    	   gList.get(i).showInfo();
       }
       
       //모든 상품의 갯수  gList.get(i)의 count를 더한다.
       for(int i=0; i<gList.size(); i++) {
    	   result = result + gList.get(i).getCount();
       }
       
       System.out.println("모든 상품의 갯수는 " + result + "개 입니다.");
       
       
       
       
       
       sc.close();
    		   
    	
    	
    }

}
