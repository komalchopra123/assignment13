import java.util.*;
import java.io.*;
  class DateFormat{
  public static void main(String[] args){

HashMap<Integer,String> dt=new HashMap<Integer,String>();
dt.put(1,"one");
dt.put(2,"two");
dt.put(3,"three");
dt.put(4,"four");
dt.put(5,"five");
dt.put(6,"six");
dt.put(7,"seven");
dt.put(8,"eight");
dt.put(9,"nine");
dt.put(10,"ten");
dt.put(11,"eleven");
dt.put(12,"twelve");
dt.put(13,"thirteen");
dt.put(14,"fourteen");
dt.put(15,"fivteen");
dt.put(16,"sixteen");
dt.put(17,"seventeen");
dt.put(18,"eighteen");
dt.put(19,"nineteen");
dt.put(20,"twenty");
dt.put(21,"twenty one");
dt.put(22,"twenty two");
dt.put(23,"twenty three");
dt.put(24,"twenty four");
dt.put(25,"twenty five");
dt.put(26,"twenty six");
dt.put(27,"twenty seven");
dt.put(28,"twenty eight");
dt.put(29,"twenty nine");
dt.put(30,"thirty");
dt.put(31,"thirty one");
 
  HashMap<Integer,String> mnt=new HashMap<Integer,String>();
mnt.put(1,"january");
mnt.put(2,"febuary");
mnt.put(3,"march");
mnt.put(4,"april");  
mnt.put(5,"may");
mnt.put(6,"june");
mnt.put(7,"july");
mnt.put(8,"august");
mnt.put(9,"september");
mnt.put(10,"ocotober");
mnt.put(11,"november");
mnt.put(12,"december"); 

 HashMap<Integer,String> yr=new HashMap<Integer,String>(); 
 yr.put(2011,"two thousand eleven");
 yr.put(2012,"two thousand twelve");
 yr.put(2013,"two thousand thirteen"); 
 yr.put(2014,"two thousand fourteen"); 
 yr.put(2015,"two thousand fivteen"); 
 yr.put(2016,"two thousand sixteen"); 
 yr.put(2017,"two thousand seventeen"); 
 yr.put(2018,"two thousand eighteen"); 
 
 String date=26/06/2018;
 Scanner sc=new Scanner(System.in);
 String date=sc.next();
 int str=Integer.parseInt(n.substring(0,2));
 int str1=Integer.parseInt(n.substring(3,4));
 int str2=Integer.parseInt(n.substring(6));
 System.out.print(dt.get(str)+" "+ mnt.get(str1)+" " + yr.get(str2)+" ");

}           
   }
}















}