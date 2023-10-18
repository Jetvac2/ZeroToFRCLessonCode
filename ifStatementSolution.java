class Main {
    public static void main(String[] args) {
      //Any conditions work
      int level = -1;
      if(22 != 55) {
        level = 1;
      } else if(22 <= 44 && 21 >= 25) {
        level = 2;
      } else {
        level = 3;
      }
      System.out.println("Level" + level);
    }
}
