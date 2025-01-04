package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try{
            int result = 1/0;
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }

    }
}
