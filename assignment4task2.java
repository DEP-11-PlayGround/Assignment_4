public class assignment4task2 {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        
        int i = 0;
        while (i < rows) {
            int j = 0;
            
            while (j < rows - i - 1) {
                System.out.print("+");
                j++;
            }
            
            j = 1;
            while (j < (i * 2) + 1) {
                System.out.print(" ");
                j++;
            }
            
            j = 0;
            while (j < rows - i - 1) {
                System.out.print("+");
                j++;
            }
            
            System.out.println();
            i++;
        }
    }
}
