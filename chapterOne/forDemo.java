package chapterOne;

public class forDemo {

    /*for(initialization; condition; update) */
    // initialization = control variable
    // condition = boolean expression
    // update = increment or decrement
    public static void main(String[] args) {
        int count;

        for (count = 1; count < 5; count = count + 1) // count = count + 1 have a shortcut = count++
            System.out.println("This is count: " + count);
        
        System.out.println("Done!");
        
    }
    
}
