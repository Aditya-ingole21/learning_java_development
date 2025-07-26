class mother{

void job (){
System.out.println("working in the bank");
}


public String toString(){

return "this is an object of daughter class"; 

}

}
class daughter extends mother{

public static void main (String [] args){

daughter d1 = new daughter();
System.out.println(d1);

daughter d2= new daughter();
System.out.println(d2);
}
}