package Algorithms_part3;

public class Stack {

    Node head; //начало списка, новый элемент добавляется ссылкой на следующий элемент к последнему элементу списка

    //Node tail; //ссылка на последний элемент

    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop(){
        Integer result = null;
        if(head != null){
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public class Node {
        int value;
        Node next;
//        Node previous;
    }
}