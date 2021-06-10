package com.ocp.day36_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadNews {
    public static void main(String[] args) throws IOException {
        String newspath ="src\\main\\java\\com\\ocp\\day36_io\\files\\news.txt";
        try (FileInputStream    fis = new FileInputStream(newspath);
             // byte[] 轉 char[] 可以支援指定編碼
             InputStreamReader  isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader     br = new BufferedReader(isr);){
             String data = null;
             while ((data = br.readLine()) != null) {
                 System.err.println(data);
             }
            
        } catch (Exception e) {
        }
    }
}
