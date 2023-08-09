public class assignment4task1 {
    public static void main(String[] args) {
        int rows = 5; 
        
        int row = 1;
        int numChars = rows;
        
        while (row <= rows * 2 - 1) {
            int col = 1;
            
            while (col <= numChars) {
                System.out.print("+");
                col++;
            }
            
            System.out.println();
            
            if (row < rows) {
                numChars--;
            } else {
                numChars++;
            }
            
            row++;
        }
    }
}
