class testoverload1{

static void addtwo (int a,int b){
System.out.println(a+b);
}
static void addtwo (int a){
a++;
System.out.println(a);
}

static void addtwo (int a,int b,int c){
System.out.println(a+(b+c));
}

public static void main(String [] args){
addtwo(13,14);

testoverload1.addtwo(1);
}
}