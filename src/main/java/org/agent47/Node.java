package org.agent47;

public class Node {
    private Integer value;
    private Node next;

    public Node(Integer value) {
        this.value = value;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node node){
        this.next = node;
    }
    public Integer getValue(){
        return value;
    }
}
