class Main {
  // Decloration
  ExampleClass example; 
  
  public static void main(String[] args) {
    // Definition, //call to the constructor
    example = new ExampleClass(5);
    // You can also do this
    // A variable of a class is called a object
    // Thus example2 is a object
    ExampleClass example2 = new ExampleClass(33);

    // Quiz: What will this print?
    // To call a method from a class you put the name of your object before the method name and then a "." followed by the method call
    System.out.println(example.getIsExample());
    
    int sum = example.calcSum(33, 22);
    System.out.println(sum);
  }
}
