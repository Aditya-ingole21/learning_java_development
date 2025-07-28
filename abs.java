abstract class abs {
abstract class add(int a,int b);
void sub (int a ,int b){
System.out.println(a-b);
}
}
class myabs extends abs {

void add (int a,int b){
System.out.println(a+b);
}

public static void main (String [] args){
abs a= new myabs();

a.add(12,13);
a.sub(12,6);
}
}


