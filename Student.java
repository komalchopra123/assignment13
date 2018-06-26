import java.util.*;
import java.io.*;
 class NameComparator implements Comparator
{
 
 

 public int compare(Student student01,Student student02)
 {
 String name1=student01.getname();
 String name2=student02.getname();
  return name1.compareTo(name2);
 }

 }
 
 		class AgeComparator implements Comparator
              {
 		
       
 	public int compare(Student student01, Student student02)
 	{
 	Integer age1=student01.getage();
 	Integer age2=student02.getage();
  	return age1.compareTo(age2);
	}

 	}
 

    class Student{

        String name;
        int age;
    Student(int age,String name)
   {
    this.age=age;
    this.name=name;
  }
  public int getage()
 { 
 return age;
 }
 public String getname()
  {
 return name;
 }

 public void setage(int age){
 this.age=age;
 }
 public void setname(String name){
 this.name=name;
 }
 
  
      public static void main(String[] args){
      ArrayList<Student> al=new ArrayList<Student>();
      al.add(new Student("komal"));
      al.add(new Student("ipsa"));
      al.add(new Student(18));
      al.add(new Student(19));
      System.out.print("by name");
      Collections.sort(al, new NameComparator());
       for(Student st:al){
      System.out.print(st.name+ "+ " +st.age);
     }
      
     System.out.print("by age");
     Collections.sort(al, new AgeComparator());
     for(Student st:al){
    System.out.print(st.name+ " + " +st.age);
}
 }    
}	
