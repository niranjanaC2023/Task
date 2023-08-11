package com.nt.niranjana.stringtrickyquestion;

import java.util.ArrayList;
import java.util.List;

public class MainClass
{
	private static void change(String s) 
	{
		 s.concat("_Morning"); //Line 9
	}
	
	private static void change2(StringBuilder s) 
	{
		 s.append("_Morning"); //Line 9
	}
	public void add()
	{
		System.out.println();
		
	}
	static void m1(CharSequence s) 
	{
		 System.out.println("CharSequence");
	} 
	static void m1(String s) 
	{
		 System.out.println("String");
	}
	static void m1(Object s) 
	{
		 System.out.println("Object");
	}
	
	public static void main(String[] args) 
	{int usrRe;
		//Question1
		 String str = "Java Rocks!";
		 System.out.println(str.length() + " : " + str.charAt(10));
		 
		 //Question:2
		 String s1 = "OcA";
		 String s2 = "oCa";
		 System.out.println(s1.equals(s2));
		 
		 //Question:3
		 String fName = "James";
		 String lName = "Gosling";
		 System.out.println(fName = lName);
		 
		 //Question:4
		 String strr = "Good"; //Line 3
		 change(strr); //Line 4
		 System.out.println(strr); //Line 5
		 
		 //Question:5
		 StringBuilder sb = new StringBuilder("Good"); //Line 3
		 change2(sb); //Line 4
		 System.out.println(sb); //Line 5
		 
		 //Question:6
		 String str1 = new String("Core");
		 String str2 = new String("CoRe");
		 System.out.println(str1 = str2);
		 System.out.println();
		 
		 //Question:7
		 	//can't create subclass of final class "String"
		 
		 //Question:8
		 String str3 = "OCAJP";
		 String str4 = "OCAJP" + "";
		 System.out.println(str3 == str4);
		 System.out.println();
		 
		 //Question:9
		 final String fNamee = "James";
		 String lNamee = "Gosling";
		 String name1 = fNamee + lNamee;
		 String name2 = fNamee + "Gosling";
		 String name3 = "James" + "Gosling";
		 System.out.println(name1 == name2);
		 System.out.println(name2 == name3);
		 System.out.println();
		 
		 //Question:10
		 final int i1 = 1;
		 final Integer i2 = 1;
		 final String s21 = ":ONE";
		 
		 String str20 = i1 + s21;
		 String str21 = i2 + s21;
		 
		 System.out.println(str20 == "1:ONE");
		 System.out.println(str21 == "1:ONE");
		 System.out.println();
		 
		 
		 //Question:11
		 String javaworld = "JavaWorld";
		 String java = "Java";
		 String world = "World";
		 java += world;
		 System.out.println(java == javaworld);
		 System.out.println();
		 
		//Question:12
		 StringBuilder sbuild = new StringBuilder(100);
		 System.out.println(sbuild.length() + ":" + sbuild.toString().length());
		 System.out.println();
		 
		 //Question:13
		 StringBuilder sbuilder = new StringBuilder("Hurrah! I Passed...");
		 System.out.println(sbuilder);
		 sbuilder.delete(0, 100);
		 System.out.println(sbuilder.length());
		 System.out.println();
		 
		 //Question:14
		 StringBuilder sbu = new StringBuilder(5);
		 sbu.append("0123456789");
		 System.out.println(sbu);
		 sbu.delete(8, 1000);
		 System.out.println(sbu);
		 System.out.println();
		 
		 //Question:15
		 StringBuilder sbb = new StringBuilder();
		 System.out.println(sbb.append("").append("").append("").length());
		 System.out.println();
		 
		 //Question:16
		// System.out.println(sbb.append(null).length());
		 
		 //Question:17
		 m1(null);
		 System.out.println();
		 
		 //Question:18
		 StringBuilder sbui = new StringBuilder("SpaceStation");
		 sbui.delete(5, 6).insert(5, " S").toString().toUpperCase();
		 System.out.println(sbui);   //Space Station
		 System.out.println();
		 
		 //Question:19
		 String st1 = new String("Java"); 
		 String st2 = "JaVa";
		 String s3 = "JaVa"; 
		 String s4 = "Java"; 
		 String s5 = "Java"; 	 
		 int i = 1; 
		 
		 //Question:21
		 List<String> list = new ArrayList<>();
		 list.add("X");
		 list.add("Y");
		 list.add("X");
		 list.add("Y");
		 list.add("Z");
		 list.remove(new String("Y"));
		 System.out.println("list: "+list);
		 
		 //Question:22
		 String strt = "java";
		 StringBuilder ssb = new StringBuilder("java");
		 System.out.println(strt.equals(ssb) + ":" + ssb.equals(strt));
		 System.out.println();
		 
		 //Question:23
		 StringBuilder sbw = new StringBuilder("Java");
		 String s12 = sbw.toString();
		 String s13 = sbw.toString();
		 System.out.println(s12 == s13);
		 System.out.println();
		 
		 //Question:24
		 String s14 = sbw.toString();
		 String s15 = "Java";
		 System.out.println(s14 == s15);
		 System.out.println();
		 
		 //Question::25
		 String sstr1 = " ";
		 boolean b1 = sstr1.isEmpty();
		 System.out.println(b1);
		 sstr1.trim();
		 b1 = sstr1.isEmpty();
		 System.out.println(b1);
		 System.out.println();
		 
		 //Question:27
		 String s16 = "OCP";
		 String s17 = "ocp";
		 System.out.println(s16.equals(s17.toUpperCase()));
		 System.out.println();
		 
		 //Question:28
		 String text = "ONE ";
		 System.out.println(text.concat(text.concat("ELEVEN ")).trim());
		 System.out.println();
		 
		 //Question:29
		 int x=7;
		 int y=100;
		 System.out.println(String.valueOf(x+y).length());
		 
		//Question:30
		 String s18 = "PANIC";
		 StringBuilder sbr = new StringBuilder("THET");
		 System.out.println(s18.replace("N", sbr));
		 System.out.println();
		 
		//Question:31
		 boolean flag1 = "Java" == "Java".replace('J', 'J'); 
		 boolean flag2 = "Java" == "Java".replace("J", "J"); 
		 System.out.println(flag1 && flag2);
		 System.out.println();
		 
		 //Question:31
		 String place = "MISSS";
		 System.out.println(place.replace("SS", "T"));
		 System.out.println();
		 
		 //Question:32
		 String s19 = "ALASKA";
		 System.out.println(s19.charAt(str.indexOf("A") + 1));
		 System.out.println();
		 
		 //Question:33
		 String [] arr = {"1st", "2nd", "3rd", "4th", "5th"};
		 String placee = "faraway";
		 System.out.println(arr[placee.indexOf("a", 3)]);
		 System.out.println();
		 
		 //Question:34
		 String word = "REBUS";
		 word = word.substring(2);
		 System.out.println(word);
		 System.out.println();
		 
		 //Question:35
		 String stre = "Game on"; //Line n1
		 StringBuilder sbq = new StringBuilder(str);
		 System.out.println(stre.contentEquals(sbq));
		// System.out.println(sbq.contentEquals(stre));  //method not present in StringBuilder
		 System.out.println(sbq.equals(stre));
		 System.out.println(stre.equals(sbq));
		 System.out.println();
		 
		 //Question:36
		 StringBuilder sbp = new StringBuilder("TOMATO");
//		 System.out.println(sbp.reverse().replace("O", "A")); //CE:
		 System.out.println();
		 
		 //Question:37
		 StringBuilder sbj = new StringBuilder("B"); 
		 sb.append(sbj.append("A"));
		 System.out.println(sbj); 
		 System.out.println();
		 
		 //Question:38
		 String textt = null;
		 textt = textt + new A(); 
		 System.out.println(textt.length()); 
		 System.out.println();
		 
		 //Question:39
		 String texxt = "RISE ";
		 texxt = texxt + (texxt = "ABOVE ");
		 System.out.println(texxt);
		 System.out.println();
		 
		 //Question:40
		 StringBuilder sbs=new StringBuilder(5);
		 String sg="";
		 if (sbs.equals(sg))
		 {
		 System.out.println("Match 1");
		 }
		 else if(sbs.toString().equals(sg.toString()))
		 {
			 System.out.println("Match 2");
		 }
		 else
		 {
		 System.out.println("Match 3");
		 }
		 
		 System.out.println();
		 //Question:41
		 String ta="A ";
		 ta = ta.concat("B ");
		 String tb="C ";
		 ta = ta.concat(tb);
		 ta.replace('C', 'D');
		 ta=ta.concat(tb);
		 System.out.println(ta);
		 System.out.println();
		 
		 //Question:45
		 String res = ""; 
		 String [] arrr = {"Dog", null, "Friendly"};
		 for(String s : arrr) 
		 { 
		 res += String.join("-", s);
		 }
		 System.out.println(res); 
		 }
		 		 
		 
}
