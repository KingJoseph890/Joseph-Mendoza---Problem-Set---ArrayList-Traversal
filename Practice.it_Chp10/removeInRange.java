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

  int val = 1;
  int start = array.get(0);
  int end = array.size()-1;

ArrayList<Integer> temp = new ArrayList<Integer>();

  for( int i = 0; i < start; i++){
    temp.add(array.get(i));
  }

  for(int i = start; i < end; i++){
    if(array.get(i) != val){
      temp.add(array.get(i));
    }
  }

  for(int i = end; i < array.size(); i++){
    temp.add(array.get(i));
  }
  array.clear();
  array.addAll(temp);
  System.out.println(array);
  }
}
*/