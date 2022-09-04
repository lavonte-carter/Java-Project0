package Chapter3._1_Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetExersize {
    public Set<Integer> createSet(){
//        return a brand new set

        return new HashSet<Integer>();
    }
    public int getSize(Set<Integer> set){
//        return the size of set
        return set.size();
    }
    public Set<Integer> addUniqueItem(Set<Integer> set, int item){
//        add item to set before returning
        set.add(item);
        return set;
    }
    public Set<Integer> removeItem(Set<Integer> set, int item){
//        remove item before returning
        set.remove(item);
        return set;
    }
}
