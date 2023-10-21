import java.util.ArrayList;

class Main {
    int[] array;
    ArrayList<Integer> copy;
    public static void main(String[] args) {
      // This is a while loop
      // while(condition)
      int value = 0;
      while(value < 10) {
        if(value == 2) {
          continue;
        }
        System.out.println(value); // This will run 5 times becasuse the continue will skip it on the third iteration and the break will stop it after iteration 6;
        if(value == 5) {
          break;
        }
        value++; // ++ Adds one to a variable. -- Subtracts one
      }

      array = {55, 13, 76, (78 - 12), 99};
      copy = new ArrayList<Integer>();
      
      // This is a for loop
      // for(iterator, condinal, statement)
      // This for loop will copy the values of this array into an array list
      for(int i = 0; i < array.length; i++) {
        copy.add(array[i]);
        // This will print out all current values in the array list in reverse order
        // This is called a nested for loop. You can also nest if statements.
        for(int j = copy.size()-1; j >= 0; ; j--) {
          System.out.println(copy.get(j));
        }
      }
    }
}
