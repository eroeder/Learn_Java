// Draws a complex boxed text figure using for loops.
// Second version that uses a class constant for the figure size.

public class HourGlass {
    public static final int SUB_SIZE = 3;

    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawMiddle();
        drawBottom();
        drawLine();
    }

    // Produces a solid "base" used at the top and the bottom. 
    public static void drawLine() {
        System.out.print("|"); 
        for (int i = 1; i <= 2 * SUB_SIZE + 2; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    public static void drawLine() {
        System.out.print("|"); 
        for (int i = 1; i <= 2 * SUB_SIZE + 2; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }
    // Produces the top half of the hourglass figure
    public static void drawTop() {
        for (int line = 1; line <= SUB_SIZE; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 1; i <= 2*(SUB_SIZE +1 - line); i++) {
                System.out.print(":");
            }
            System.out.println("/");
        }
    }
    
    // Produces the belt section of the hour glass. 
    public static void drawMiddle() { 
        for (int i = 1; i <= SUB_SIZE +1; i++) {
                System.out.print(" ");            
        }
        System.out.println("||"); 
    }
    // Produces the bottom half of the hourglass figure. 
    public static void drawBottom() {
        for (int line = 1; line <= SUB_SIZE; line++) {
            for (int i = 1; i <= SUB_SIZE + 1 -line; i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * line; i++) {
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }
}
eroeder
Commit new file

    }

    // Produces the top half of the hourglass figure
    public static void drawTop() {
        for (int line = 1; line <= SUB_SIZE; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 1; i <= 2*(SUB_SIZE +1 - line); i++) {
                System.out.print(":");
            }
            System.out.println("/");
        }
    }
    
    // Produces the belt section of the hour glass. 
    public static void drawMiddle() { 
        for (int i = 1; i <= SUB_SIZE +1; i++) {
                System.out.print(" ");            
        }
        System.out.println("||"); 
    }

    // Produces the bottom half of the hourglass figure. 
    public static void drawBottom() {
        for (int line = 1; line <= SUB_SIZE; line++) {
            for (int i = 1; i <= SUB_SIZE + 1 -line; i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * line; i++) {
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }
}
