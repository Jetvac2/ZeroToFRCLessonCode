// These are imports
import java.util.ArrayList;
import java.util.HashMap;

class Main {
  // Array decloration
  // type[] name;
  int[] array;
  boolean[] boolArray;
  
  // ArrayList decloration
  // ArrayList<type> name;
  ArrayList<Integer> arrayList;

  // HashMap Decloration
  // HashMap<type of key, type of value>
  HashMap<String, Integer> hashMap;
  
  public static void main(String[] args) {
    // Array Instantiation
    // name = new type[length];
    array = new int[5];
    // You can also do this
    boolArray = {true, false, true, true};
  
    // Array Instantiation
    // name = new ArrayList<type>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
  
    // Array Instantiation
    // name = new HashMap<type of key, type of value>();
    hashMap = new HashMap<String, Integer>();

    // Getting values from arrays. This functions the smae as variables.
    // name[index]
    array[0] = 44;
    array[1] = 55;
    array[2] = 24;
    array[3] = 41;
    array[4] = 1005;

    // This will print the second index of the array
    System.out.println(array[2]);

    // To get the length of a array use name.length
    int lengthOfArray = array.length; // this is equal to 5

    // Adding values to a ArrayList
    // name.add(value);
    // .add will add the value to the end of the array list. For example if there are ten elements already in the list and you add one more it will be element 11
    arrayList.add(22);
    arrayList.add(84);
    arrayList.add(81);
    arrayList.add(45);

    // Getting values from a ArrayList
    // name.get(index)
    System.out.println(arrayList.get(0));  

    // Resetting the value of an ArrayList index
    // name.set(index, value);
    arrayList.set(1, 13); // Index now hold 13 instead of 84

    // Removeing values from an ArrayList
    // name.remove(index);
    // This removes the current index 0. All subsequent indexes are moved down by one. 
    arrayList.remove(0);

    // Getting the length of an ArrayList
    // name.size()
    System.out.println(arrayList.size()); // This will print 4
    
    // Clearing the entire ArrayList, removes all values
    // name.clear();
    arrayList.clear();

    // Adding values to a HashMap
    // name.put(key, value)
    hashMap.put("HashMapValue", 53);
    hashMap.put("YayIAmAKey", 53);

    // Getting values from a HashMap
    // name.get(key);
    System.out.println(hashMap.get("HashMapValue")); // This will print 53

    // Removeing values from a HashMap
    // name.remove(key);
    hashMap.remove("YayIAmAKey");
    
    // Clearing the entire HashMap, removes all values
    // name.clear();
    hashMap.clear();
  }
}
