// Operators
// Greater than: >
// Greater than or equal to: >=
// Less than: <
// Less than or equal to: <=
// Equal to: ==
// Not equal to: !=
// And: &&
// Or: ||
// Not: !
class Main {
      boolean example = 33 < 57;
    public static void main(String[] args)
    {
        // Example "if" statement
        if(true) {
          // Code in here will run
        }
      
        // Example "if" statement with boolean equation
        if((56 >= 23) && (85 == 22)) {
          // Code in here will not run
        } else if((22 != 22) || (82 < 100)) {
          // Code in here will not run
        } else if((55 != 1) || (1 >= 55)) {
          // Code in here will run
        }
      
        // Example "if" statement with boolean equation
        if((!(56 <= 23)) && (85 == 22)) {
            // Code in here will not run
        } else if((22 != 22) || (82 < 100)) {
          // Code in here will not run
        } else {
          // Code in here will run
        }
        
        if(example) {
          // Code in here will run
        }

      // Example print to console
      System.out.println("The answere is:" + !example);
    }
}



