 interface inter1{
void add(int a,int b);
}

interface inter2{
  public abstract void sub (int a,int b);
}

class testInter1 implements inter1,inter2{
public void add (int a,int b){
System.out.println(a+b);
}
public void sub (int a,int b){
System.out.println(a-b);
}


public static void main(String [] args){
inter1 obj = new testInter1();
obj.add(12,13);

inter2 obj2 = new testInter1();
obj2.sub (20,12);
}
}
