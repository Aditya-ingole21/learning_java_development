class Ex1{

static void div (int x, int y){
try{
System.out.println(x/y);
}catch(ArrayIndexOutOfBoundsException e1){
System.out.println(" div () Please Enter Any two value" );

}

}

public static void main(String[] args){
int a=0;
int b=0;

try{String s1 = args[0];
String s2 =args [1];

System.out.println(s1+s2);
 a = Integer.parseInt(s1);
 b =Integer.parseInt(s2);

System.out.println(a+b);
System.out.println(a/b);
}


catch(NumberFormatException e2){
System.out.println("Please Enter only Numeric values" );
System.out.println(e2);

}

catch(ArithmeticException e3){
System.out.println(" The 2nd value should be a Non Zero Number " );
System.out.println(e3);

}

finally{
System.out.println("finally block is reached");


}

div(a,b);

}
}
