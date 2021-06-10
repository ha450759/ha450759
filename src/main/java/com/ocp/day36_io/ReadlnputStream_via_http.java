package com.ocp.day36_io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadlnputStream_via_http {
    public static void main(String[] args) throws IOException {
         String path = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
         URL url = new URL(path);
         InputStream is = url.openConnection().getInputStream();
         int ch = 0;
         while ((ch = is.read()) != -1) { // 
             System.out.print(ch);
         }
    }
}
