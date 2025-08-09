import java.io.*;

class RandomAccess1{

public static void main (String [] args ){

try {

RandomAccessFile file = new RandomAccessFile("input.txt","rw");
//file.seek(0);
file.seek(5);

String first = file.readLine();

System.out.println(first);

}
catch( Exception e){
System.out.println(e);
}
}
}

