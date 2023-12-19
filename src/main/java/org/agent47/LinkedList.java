package org.agent47;

public class LinkedList {
    private Node head;
    public void insert(Integer value){
        Node node = new Node(value);
        if (head==null){
            head = node;
        }
        else {
            Node n = head;
            while (n.getNext()!=null){
                n=n.getNext();
            }
            n.setNext(node);
        }
    }
    public void  show(){
        Node n = head;
        do {
            System.out.println(n.getValue());
            n=n.getNext();
        }while (n.getNext()!=null);
        System.out.println(n.getValue());
    }
    public void insertAtStart(Integer value){
        Node node = new Node(value);
        if(head==null){
            head = node;
        }
        else {
            node.setNext(head);
            head=node;
        }
    }
    public void insertAt(Integer index, Integer value){
        Node node = new Node(value);
        Node pointer = head;
        if(head== null){
            head = node;
        } else if (index ==0) {
            insertAtStart(value);
        } else {
            while (!index.equals(1)){
                System.out.println(index);
                pointer= pointer.getNext();
                index--;
            }
            node.setNext(pointer.getNext());
            pointer.setNext(node);

        }
    }
    public void deleteAt(Integer index){
        if(index ==0){
            head= head.getNext();
        }
        else {
            Node node = head;
            for (int i = 0; i<index-1; i++){
                node=node.getNext();
            }
            node.setNext(node.getNext().getNext());
        }
    }
}
