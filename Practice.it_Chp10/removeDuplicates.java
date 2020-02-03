/*import java.util.*;

class Main {
  public static void main(String[] args) {
  ArrayList<String> array = new ArrayList<String>();
  array.add("four");
  array.add("four");
  array.add("three");
  array.add("two");
  array.add("one");
  array.add("one");

ArrayList<String> temp = new ArrayList<String>();

  for(int i = 0; i < array.size() -2; i+=2){
    if(temp.size() == 0 || !temp.get(temp.size()-1).equals(array.get(i))){
      temp.add(array.get(i));
    }
  }
  array.clear();
  array.addAll(temp);
  System.out.println(array);
  }
}
*/