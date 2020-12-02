package com.tuyano.CollectionGenerics;
import java.util.*;
class Student{
    private int id;
    private String tel;
    public Student(int Id, String Tel) { id= id; tel=Tel;}
    public int getId(){ return id;}
    public String getTel(){return tel;}
}

public class HashMapStringStudent {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<String,Student >();
        map.put("kkk",new Student(1,"010-1111-1111"));
        map.put("ttt",new Student(2,"010-2222-2222"));
        map.put("hhh",new Student(3,"010-3333-3333"));

        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Name to search for?");
            String name = scan.nextLine();
            if(name.equals("exit")) break;
            Student student = map.get(name);
            if(student==null) System.out.println(name + " is not here.");
            else System.out.println("id : "+ student.getId() + " ,Tel : " + student.getTel());
        }
    scan.close();
    }
}
