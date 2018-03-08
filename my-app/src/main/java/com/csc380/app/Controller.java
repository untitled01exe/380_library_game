package com.csc380.app;

import java.util.concurrent.TimeUnit;

public class Controller {

    Screen s;
    String[] array = new String[30];

    public Controller(){
        Screen screen = new Screen();
        s = screen;
        for (int i = 0; i < array.length; i++){
            array[i] = "" + (i+1);
        }
    }

    int flag = 00000000;

    public void startUp(){
        s.config_test();
        s.build_screen();
        s.splash_screen();
        System.out.println("");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void nextCommand(String token){
        switch(flag){
            case 00000000:
                if(token.equals("start")){
                     s.page(array, 1, 2);
                }else{
                    System.out.println("controller machine BROKE");
                }
                break;
            default:
                System.out.println("Game Machine BROKE");

        }
    }
}
