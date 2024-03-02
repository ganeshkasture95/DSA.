package SimpleDSA.hashtable;

import java.util.Hashtable;

/**
 * ---------HashTable----------
 * A data structure that stores unique keys to values ex.<Integer,string>
 * Each key/value pair is known Entry,
 * FAST insertion,look up,deletion of keys.values pairs
 * No idea of small data sets ,Greate with big datasets
 * 
 * __________* Hashing*___________
 * Takes a key and computes an Integert
 * (formula will be based on key & its data type)
 * In a Hashtable,we use the hash % capacity to
 * calculate an index number
 * 
 * key.hashcode() % capacity = index
 * 
 * Bucket
 * an indexed storage location for one or more Enties
 * can store multiple entity in case of collision (in a linked list)
 * 
 * 
 * key = 100 then hashcode= 100 index= 0
 * 
 * 
 * ex *
 * 111
 * 2
 * 33
 * 4
 * 55555
 */
public class HT {

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Ganesh");
        table.put(345, "Sudhanshu");
        table.put(234, "Shivam");
        table.put(325, "saurabh");
        table.put(943, "patu");

        // table.remove(234);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
