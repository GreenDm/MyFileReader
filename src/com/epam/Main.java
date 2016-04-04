package com.epam;

import java.io.*;

/**
 * Created by m18 on 04.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        try{
        BufferedReader reader = new BufferedReader( new FileReader("ttt"));
            String read = reader.readLine();
            while(read != null){
            System.out.println(read);
                read = reader.readLine();
            }

    }catch(FileNotFoundException e){

        }catch(IOException b){
            b.printStackTrace();

        }
       try{
           FileReader reader1 = new FileReader("ttt");
        int read1 = reader1.read();
           while(read1!= -1){
               System.out.println((char)read1);
               read1 = reader1.read();

           }

    }catch(IOException e){
           e.printStackTrace();
       }
    }
}
