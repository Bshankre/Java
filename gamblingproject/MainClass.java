package com.gamblingproject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		
		System.out.println("Enter your name ");
		String uName=sc.next();
		System.out.println("Enter your Phone number ");
		long phNo=sc.nextLong();
		
		double rAmt = 0;
		int[] uNum=new int[3];
		System.out.println("Enter investment ");
		double iAmt=sc.nextDouble();
		double aPerg=iAmt/3;
		Random r=new Random();
		int[] arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(11);
		}
		System.out.println("random numbers");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter guess the three numbers");
		for(int i=0;i<arr.length;i++) {
			uNum[i]=sc.nextInt();
			if(arr[i]==uNum[i]) {
				System.out.println("great you guessed correct number");
				rAmt=rAmt+aPerg*2;
			}else {
				System.out.println("Better luck try again..");
			}
		}
		System.out.println("Total you have earned "+rAmt);
	
//		==========================hibernate======================
		
               EntityManagerFactory e=Persistence.createEntityManagerFactory("game");
               EntityManager m=e.createEntityManager();
               EntityTransaction t=m.getTransaction();
		       
               Gambling g=new Gambling();
               g.setuName(uName);
               g.setPhNo(phNo);
               g.setSysNum(Arrays.toString(arr));
               g.setUseNum(Arrays.toString(uNum));
               g.setiAmt(iAmt);
               g.setrAmt(rAmt);
               t.begin();
               m.persist(g);
               t.commit();
//               
               
//               fetching
//              Gambling g= m.find(Gambling.class, 1);
//              System.out.println(g.getId()+" "+g.getuName()+" "+g.getiAmt()+" "+g.getPhNo()+" "+g.getrAmt());
	
               //updating
//               Gambling g=m.find(Gambling.class, 1);
//               g.setiAmt(2000);
//               t.begin();
//               m.merge(g);
//               t.commit();
               
               //deleting
//               Gambling g=m.find(Gambling.class, 1);
//               t.begin();
//               m.remove(g);
//               t.commit();
//               
	
	}

}
