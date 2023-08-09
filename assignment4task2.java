public class assignment4task2 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        
        int i = 0;
        while (i < rows) {
            int j = 0;
            
            
            while (j < i) {
                System.out.print("+");
                j++;
            }
            
            j = 0;
            
            while (j < (2 * (rows - i)) - 1) {
                System.out.print(j == 0 || j == (2 * (rows - i)) - 2 ? "+" : " ");
                j++;
            }
            
            j = 0;
            
            while (j < i) {
                System.out.print("+");
                j++;
            }
            
            System.out.println();
            i++;
        }
    }
}
