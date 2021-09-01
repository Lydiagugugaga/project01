package com.atguigu.java;
/*
常用的模板
 */


import com.atguigu.bean.Customer;

import java.util.ArrayList;

public class TemplatesTest {

    //prsf
    private static final Customer cust = new Customer();
    //psf
    public static final int NUM = 1;
    // psvm--main
    public static void main(String[] args) {
        //sout
        System.out.println("huhu");
        //变形：xxx.sout
        int num1 = 10;
        System.out.println(num1);

        // fori
        String[] arr = new String[]{"Tom", "Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        // itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(564);
        list.add(987);
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
        }
    }
    public void method(){
        System.out.println("TemplatesTest.main");

        // ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(564);
        list.add(987);
        if (list == null) {
            
        }
        // 变形：inn xxx.nn/xx.null
        if (list != null) {
            
        }


    }



}
