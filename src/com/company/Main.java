package com.company;
import java.util.*;
import java.io.*;

public class Main {
    public static   String Compression1(String str){
    String s = str.charAt(0) + "";
            for(int i=1;i<str.length();i++){
                char curr = str.charAt(i);
                char prev = str.charAt(i-1);
                if(curr != prev){
                    s += curr;
                }
            }
            return s;
        }
    public static   String Compression2(String str){
        String s = str.charAt(0) + "";
        int count =1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr ==prev){
                count++;
            }
            else {
                if (count > 1) {
                    s += count;
                    count = 1;
                }
                s += curr;}}

                if (count > 1) {
                    s += count;
                    count = 1;
                }

        return s;
    }
        public static  void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
        //    System.out.print(Compression1(str));
                System.out.print(Compression2(str));
        }
    }
