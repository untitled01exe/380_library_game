import java.util.concurrent.TimeUnit;

public class Screen {

    private String[] screen_array = new String[36];
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
            screen_array[i] = "|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|TEST|";
        }
    }

    private void clear(){
        for(int i = 0; i < screen_array.length; i++){
            screen_array[i] = "";
        }
    }

    public void splash_screen() {
        this.clear();
    screen_array[16] = "                              COLD MUSTARD                                  ";
    screen_array[17] = "                               /W kastsup                                   ";
    this.build_screen();
        try {
            TimeUnit.SECONDS.sleep(2);
            screen_array[34] = "LOADING.";
            this.build_screen();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
            screen_array[34] = "LOADING..";
            this.build_screen();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
            screen_array[34] = "LOADING...";
            this.build_screen();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
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
}
/*

Books:                                                                          .

1:
2:
3:
4:
5:
6:
7:
8:
9:
10:
11:
12:
13:
14:
15:
16:
17:
18:
19:
20:
21:
22:
23:
24:
25:
26:
27:
28:
29:
30:

Page 1 of 2
Type "help" for help
 */