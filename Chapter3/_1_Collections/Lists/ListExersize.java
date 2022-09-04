package Chapter3._1_Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListExersize {
    public List<Integer> createList(){
//        return a brand-new list that contains type Integer.
        return new ArrayList<Integer>();
    }
    public int getSize(List<Integer> list) {
        new ArrayList<Integer>();
        return list.size();

    }
    public List<Integer> addToList(List<Integer> list, int value){
        list.add(value);
//        add to end of list before return.
        return list;
    }
    public int get(List<Integer> list, int index){
//        return the item at index position.
        return list.get(index);
    }
    public List<Integer> removeFromList(List<Integer> list, int position){
//        remove the item at position before return.*******
        list.remove(position);
        return list;

    }
    public List<Integer> updateAtPosition(List<Integer> list, int value, int position){
//        update item at position to value before return.
        //new ArrayList<Integer>();
       // List<Integer> updateAtPosition = new ArrayList<Integer>();
        list.set(position, value);
        return list;
        //return null;
    }
}