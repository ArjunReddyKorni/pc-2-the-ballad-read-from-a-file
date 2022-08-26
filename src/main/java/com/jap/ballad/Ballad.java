package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        String response = "";

        FileInputStream fileInputStream = null;
        int data =0;

        try{
            fileInputStream = new FileInputStream(fileName);
            while(data != 0){
                data = fileInputStream.read();
               char  dataChar = (char)data;
               response = response + dataChar;

            }

        }catch (FileNotFoundException e){
            System.out.println("e = " + e);
            e.printStackTrace();

        }catch (IOException e){
            System.out.println("e = " + e);
            e.printStackTrace();
        }
        return response;
    }

    public static void main(String[] args) {


    }




}
