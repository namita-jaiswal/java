package hashing;
import java.util.*;

public class chaining {
    static class MyHash {
        int BUCKET;
        ArrayList<LinkedList<Integer>>table; // function to create a doubly linked list in JAVA.
        MyHash(int b){
            BUCKET=b;
            table=new ArrayList<LinkedList<Integer>>();
            for(int i=0;i<b;i++){
                table.add(new LinkedList<Integer>());
            }
        } 

    void insert(int key){ // function to insert key into the bucket.
        int i=key%BUCKET;
        table.get(i).add(key);
    }

    void remove(int key){ // function to remove key from the bucket.
        int i=key%BUCKET;
        table.get(i).remove((Integer)key);
    }

    boolean search(int key){ // function to search key in the bucket.
        int i=key%BUCKET;
        return table.get(i).contains(key);
    }
    public static void main(String[] args) { // main class
        MyHash mh=new MyHash(7);
        mh.insert(70);
        mh.insert(72);
        mh.remove(70);
        System.out.println(mh.search(70));
        System.out.println(mh.search(72));
        }
    }
}