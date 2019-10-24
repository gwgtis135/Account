package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    //예금주 ㅇ름
    private String name;
    //계좌번호
    private String no;
    //잔고
    private int jango;

    Main(String n, String num, int j){
        name = n;
        no = num;
        jango = j;

    }
    //예금주 본인확인
    String getName(){
        return name;
    }
    //계좌번호 확인
    String getNo(){
        return no;
    }
    //잔고 확인
    int getJango(){
        return jango;
    }

    //입금
    void addmoney(int k) {
        jango +=k;
    }
    void minusmoney(int k){
        jango -=k;
    }
    public String toString(){
        return "계좌정보를 입력하세요\n"+"명의: "+name+"\n"+"계좌 번호 :"+no+"\n"+"잔고"+jango+"\n";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌정보를 입력하세요");
        System.out.println("명의: ");
        String name = sc.next();
        System.out.println("계좌 번호");
        String no = sc.next();
        System.out.println("잔 고 ");
        int jango = sc.nextInt();
        Main a = new Main(name, no, jango);
        System.out.println(a);


        }




    }

