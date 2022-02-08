package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Execute command =new Execute();
        Scanner s=new Scanner(System.in);
        String cmnd;
        while(true) {
            cmnd=s.next();
            command.getCommands(cmnd);
        }
    }
}
