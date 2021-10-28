
public class PascalTriangle {

    static void spaces(int i){
        for(int space = 1; space <= 6-i; space++)
            System.out.print("  ");
    }

    public static void main(String[] args) {
        int j;
        for(int i = 0; i < 6; i++) {
           spaces(i);
            j = 0;
            while (j <= i) {
                System.out.print("*   ");
                j++;
            }
            System.out.println();
        }
    }
}



