class Main {
  public static void main(String[] args) {
    int[] array = {55, 33, 66, 22, 21}; 
    ArraySorter sort = new ArraySorter(true);
    sort.sortArray(array);
    sort.setLeastToGreatest(false);
    sort.sortArray(array);
  }
}
