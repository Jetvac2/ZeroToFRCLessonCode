public class ArraySorter {
  private boolean leastToGreatest;
  public ArraySorter(boolean leastToGreatest) {
    this.leastToGreatest = leastToGreatest;
  }

  public void sortArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      int leftSide = i;
      for(int j = i; j < array.length; j++) {
        if(leastToGreatest) {
          if(array[leftSide] >= array[j]) {
            leftSide = j;
          }
        } else {
          if(array[leftSide] <= array[j]) {
            leftSide = j;
          } 
        }
        if(leftSide != i) {
          int temp = array[leftSide];
          array[leftSide] = array[i];
          array[i] = temp;
        }
      }
    }
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public boolean getLeastToGreatest() {
    return this.leastToGreatest;
  }

  public void setLeastToGreatest(boolean leastToGreatest) {
    this.leastToGreatest = leastToGreatest;
  }
}
