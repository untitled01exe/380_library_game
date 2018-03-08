package com.csc380.app;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Controller c = new Controller();
        c.startUp();
        BkGenerator bk = new BkGenerator();
        Scanner input = new Scanner(System.in);
        String token = input.nextLine();
        while(!token.equals("exit")){
            c.nextCommand(token);
            token = input.nextLine();
        }
    }
}
