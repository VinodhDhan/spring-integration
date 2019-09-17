package com.vin.springintegrationdemo;

public class ReverseService {

    public void reverse(String message){
        System.out.println(new StringBuilder(message).reverse().toString());
    }

}
