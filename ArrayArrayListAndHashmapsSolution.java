// These are imports
import java.util.ArrayList;
import java.util.HashMap;

class Main {
  
  double[] array;
  ArrayList<Integer> arrayList;
  HashMap<String, String> hashMap;
  
  public static void main(String[] args) {
    array = new int[3];
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    hashMap = new HashMap<String, Integer>();

    array[0] = 18;
    array[1] = 13;
    array[2] = 17;

    System.out.println(array[0]);
    System.out.println(array.length);

    arrayList.add(11);
    arrayList.add(101);
    arrayList.add(78);

    arrayList.remove(1);
    
    System.out.println(arrayList.size());    
 
    hashMap.put("Key", "Value");
    System.out.println(hashMap.get("Key"));
  }
}
