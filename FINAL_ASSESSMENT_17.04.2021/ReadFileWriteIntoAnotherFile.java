package com.readonewriteanotherfile;

package com.readonefilewriteanother;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

   public static void main(String[] args) {

     try {

           FileInputStream fin = new FileInputStream("C:\\Users\\gopv2c18465\\git\\FinalAssessment2\\Final Assessment1\\filename.txt");

           int i = 0;
           String s = "";

           while((i=fin.read())!=-1) {

               s = s + String.valueOf((char)i);

           }

           FileOutputStream fout = new 
           FileOutputStream("D:\\newtest1.txt");
           byte[] b = s.getBytes();

           fout.write(b);
           fout.close();

           System.out.println("reading and writing are completed !!");

      } catch(Exception e){
         System.out.println(e);
      }

    }

 }
