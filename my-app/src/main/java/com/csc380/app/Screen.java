package com.csc380.app;
import java.util.concurrent.TimeUnit;

public class Screen {

    private String[] screen_array = new String[35];
    private String screen_print;

    public void build_screen() {
        screen_print = "";
        for (int i = 0; i < screen_array.length; i++) {
            screen_print = screen_print +  screen_array[i] + "\n";
        }

        System.out.println(screen_print);
    }


    public void config_test() {
        for (int i = 0; i < screen_array.length; i++) {
            screen_array[i] = "|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TE";
        }
    }

    private void clear(){
        for(int i = 0; i < screen_array.length; i++){
            screen_array[i] = "";
        }
    }

    public void splash_screen() {
        this.clear();
    screen_array[16] = "                               COLDMUSTARD";
    screen_array[17] = "                                W kastsup";
    this.build_screen();
        try {
            TimeUnit.SECONDS.sleep(1);
            screen_array[34] = "LOADING.";
            this.build_screen();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(1);
            screen_array[34] = "LOADING..";
            this.build_screen();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(1);
            screen_array[34] = "LOADING...";
            this.build_screen();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(1);
            this.menu();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void menu(){
        this.clear();
        screen_array[5] = "                             The Libary Game";
        screen_array[15] = "                                -start-";
        screen_array[18] = "                              *MORE SOON*";
        screen_array[33]= "Type all commands...";
        this.build_screen();
    }

    public void page(String[] books, int pageNum, int max) {
        this.clear();
        for (int i = 1; i < 31; i++) {
            screen_array[i + 2] = i + ": " + books[i - 1];
        }
        screen_array[1] = "BOOKS:";
        screen_array[33] = "PAGE " + pageNum + " OF " + max;
        screen_array[34] = "TYPE help FOR HELP";
        this.build_screen();
    }
}
