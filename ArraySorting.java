import java.io.*;
import java.util.Arrays;
 
 class ArraySorting{
 public static<M> void printArray(M[] array){
 for(M a: array )
System.out.printf("%s", a);
 System.out.println();
}
   public static void main(String[] args){
 
 String[] Names={"khushi", "mehak", "aaliya"};
  Arrays.sort(Names);
 System.out.println(Arrays.toString(Names));

 double[] lengths={580.5, 246.8, 8.6, 8.9};
 Arrays.sort(lengths);
 System.out.println(Arrays.toString(lengths));

 Integer[] num={67,89,56,90};
 Arrays.sort(num);
 System.out.println(Arrays.toString(num));

}

}