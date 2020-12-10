package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	List<Friend> fList = new ArrayList<Friend>(); //ArrayList 사용? 
    	Friend[] fArr = new Friend[3];
    	
    	System.out.println("친구를 3명 등록해 주세요.");
    	
    	for(int i=0; i<fArr.length; i++) {
    		String fr = sc.nextLine(); //친구정보 입력받아 --> Scanner
    		String[] data = fr.split(" "); // " "split으로 쪼개어 스트링배열에 저장
    		
    		Friend friend = new Friend(); // Friend 객체를 생성하고
    		
    		friend.setName(data[0]); // Friend 객체에 넣는다
    		friend.setHp(data[1]);
    		friend.setSchool(data[2]);
    		
    		fArr[i] = friend; // Friend 객체 배열에 넣는다.
    		
    	}
    	
    	//출력
    	for(int i=0; i<fArr.length; i++) {
    		fArr[i].showInfo();
    	}
    	
    	
    	sc.close();
    	
    }

}
