

class Student {


    int id;
    String name;
    int mark;

    Student(int sid, String sname, int smark) {
        this.id = sid;
        this.name = sname;
        this.mark = smark;
        System.out.println("ID:"+this.id+"\n"+"Name:"+ this.name+"\n" + "Marks:" + this.mark);


    }

    public static void main(String[] args) {
        Student obj = new Student(21, "Aditya Ingole", 10);
    }
}


