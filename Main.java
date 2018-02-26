public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void screen_print(String[] screen) {
        String final_screen = "";
        for(int i = 0; i < 36; i++){
            final_screen = final_screen + screen[i] + '\n';
        }
        System.out.println(final_screen);
    }
}