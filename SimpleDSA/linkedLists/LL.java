package SimpleDSA.linkedLists;

import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("ganesh");
        list.add("kasture");
        list.addFirst("The King ");

        list.addFirst("One and Only");

        System.out.println("This is my first linked list i made ");
        System.out.println(list.size());
        System.out.println(list);

        String gk = list.removeFirst();
        System.out.println(gk);

        // Linked List = stores nodes i 2 perts(data+address)
        // Nodes are in non-contiguous memory locations
        // elements elements are linked using pointers

        // Singly Linked List

        // node node node
        // [data|next]<->[node|next]<->[node|next]

        // Boublly Linked List

        // node node node
        // [prev|data|next]<->[prev|data|next]<->[prev|data|next]

        // uses ?
        // 1.implementation stack/queues
        // 2.GPS nsvigstion
        // 3.music Playlist

    }
}
