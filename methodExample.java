class Main {
     // This is a method, Java just automaticly calls this method for you
   int number = 42;
   int sum;
    public static void main(String[] args) {
      // Calling methods
      sum = add(55, number);
      // This is also a method named println, ignore the System.out part for now, we will cover why that is needed later.
      System.out.println(sum);

      printNumber(sum);
    }

    // type, name, (arguments)
    int add(int num1, int num2) {
      return num1 + num2;
    }

     // Example 2
     double multiplyBy44(double num1) {
      double value = 44;
      return value * num1;
    }

    // You can have a "void" return type. A void return type does not have a return statement.
    void printNumber(int num) {
      System.out.println(num);
    }
   
}
