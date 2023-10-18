class Main {
    public static void main(String[] args) {
      double area = triangleArea(55.3, 22.1);
      System.out.println(area);
    }

     double triangleArea(double base, double height) {
      return base * height / 2;
    }
}
