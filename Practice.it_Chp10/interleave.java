/*import java.util.*;

class Main {
  public static void main(String[] args) {
  ArrayList<Integer> array = new ArrayList<Integer>();
  array.add(1);
  array.add(2);
  array.add(3);
  array.add(4);
  array.add(5);
  array.add(6);

  ArrayList<Integer> array2 = new ArrayList<Integer>();
  array.add(2);
  array.add(5);
  array.add(7);

  int size1 = array.size();
  int size2 = array2.size();
  int index1 = 0;
  int index2 = 0;
  boolean thing = true;

  while(index1 < size1 || index2 < size2 ){
    if(index1 < size1 && thing){
      array.add(array.get(index1));
      index1++;
    }
    else if(index2 < size2 && !thing){
      array.add(array2.get(index2));
      index2++;
    }
    thing = !thing;
  }
  array.subList(0,size1).clear();
  System.out.println(array);
  }
}
*/