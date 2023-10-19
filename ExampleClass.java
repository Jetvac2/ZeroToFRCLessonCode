// Imports to other classes go here

// Class Declaration
class ExampleClass {
    // Instance Variables
    // private type name
    private int exampleInstanceVar;
    private boolean isExample = true;

    // This is a constructor 
    ExampleClass(int exampleInstanceVar) {
      // Setting a instance variables use the this key word
      this.exampleInstanceVar = exampleInstanceVar;
      // You can do other things in a constructor as well
      if(isExample) {
        System.out.println("YAY, I am a example!!");
      }
    }

    // This is a getter method
    public boolean getIsExample() {
      // You generaly use they "this" key whenever usign a instanse variable
      return this.isExample;
    }

    // This is a setter method
    public void setIsExample(boolean isExample) {
      this.isExample = isExample;
    }

    private void print(int numberToPrint) {
      // You are not able to access numberToPrint outside of this method because it is declared inside this scope.
      System.out.println(numberToPrint);
    }

    public int calcSum(int num1, int num2) {
      int sum = num1 + num2;
      print(sum);
      return sum;
    }
}
