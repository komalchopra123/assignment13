class Generic{
 public static<a>void print(a[] args){
 for(a x:args){
 System.out.println(x);
}
}
}
  
 class Function{
 public static void main(String[] args){
  
 Generic gn= new Generic();
 Integer a[]={1,2,3,4,5};
 Character c[]={'a','b','c','d','e'};
 Double d[]={1.2,4.2,5.6,8.9};
 gn.print(a);
 gn.print(c);
 gn.print(d);
}
}