package com.tuyano.WrapperEx;

import java.util.*;

public class StringMethod {
    public static void main(String[] args) {
        String a = new String(" C#");
        String b = new String(",C++ ");

        System.out.println(a+"Length : "+a.length()); // string length
        System.out.println(a.contains("#")); //string inclusion relation
        // result ture

        a=a.concat(b); //string connect
        System.out.println(a);
        // result " C#,C++ "

        a=a.trim(); // Remove spaces before and after a string
        System.out.println(a);
        // result "C#,C++"

        a=a.replace("C#","Java");// string a confrontation
        System.out.println(a);
        // result "Java,C++"

        String s[] = a.split(","); //string separation
        for(int i=0; i<s.length;i++)
            System.out.println("" + i + ":" + s[i]);
        // result s[0] = "Java" , s[1] = "C++"

        a= a.substring(5); //Return strings from index 5 to end
        System.out.println(a);
        // result "C++"

        char c = a.charAt(2); // Return Character from index 2
        System.out.println(c);
        // result '+'


        ////String Burffer////

        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil");
        System.out.println(sb);
        // result This is pencil


        sb.insert(7," my");
        System.out.println(sb);
        // result This is my pencil


        sb.replace(8,10,"your");
        System.out.println(sb);
        // result This is your pencil


        sb.delete(8,13);//"your" delete
        System.out.println(sb);
        // result This is pencil


        sb.setLength(4);//Modify string length in string buffer
        System.out.println(sb);
        // result This

        //////String tokenizer//////
        String query = "name=tae&Addr=BuSan&age=21";
        StringTokenizer stn = new StringTokenizer(query,"&");
        int count = stn.countTokens();

        System.out.println("token count = " + count);
        //token count = 3
        for(int i=0; i<count; i++) {
            String token = stn.nextToken();
            System.out.println(token);
        }
        //name=tae //Addr=BuSan // age=21


        StringTokenizer st = new StringTokenizer("1/2/3/4/5/6/7/8","/");

        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
        //result 1 //2 //3 //4 //5 //6 //7 //8


    }
}
