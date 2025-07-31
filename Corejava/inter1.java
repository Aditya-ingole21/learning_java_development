 interface inter1{
void add(int a,int b);
}

class testInter1 implements inter1{
public void add (int a,int b){
System.out.println(a+b);
}


public static void main(String [] args){
inter1 obj = new testInter1 ();
obj.add(12,13);
}
}
