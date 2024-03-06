package com.learning.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://www.simplilearn.com/");

        InetAddress simplilearnAddress = Inet4Address.getByName("www.simplilearn.com");

        //BufferedReader in = new BufferedReader(
        //        new InputStreamReader(oracle.openStream()));

        System.out.println(simplilearnAddress.getHostAddress());
        System.out.println(simplilearnAddress.getHostAddress());
        System.out.println(oracle.getAuthority());
        System.out.println(oracle.getPath());
        System.out.println(oracle.getUserInfo());
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            //System.out.println(inputLine);
        in.close();
    }
}
