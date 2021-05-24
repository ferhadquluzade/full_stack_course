package formattedstrings;

public class Main {
    
    public static void main(String[] args) {
        int i = 2;

        int x = 3;

        String s = "Hello";

        String res = "Hello " + i + " " + 2;

        String sf = String.format("%s %d %d", s, i , x);

        // %s - string format
        // %d - integer format
        // %c - character format
        // %f - floating point number format

        char ch = 'A';

        System.out.println(String.format("%c", ch));

        System.out.println(String.format("%f", 45.5));
        System.out.println(String.format("%f", i * 1.0));

        System.out.println(String.format("%.2f", 45.567899));

        System.out.println(sf);


        for (int j = 0; j < 200; j++){
            System.out.println(String.format("%05.2f", j * 1.67));
        }
    }
    
    
}
