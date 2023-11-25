package Algorithms_part3;

public class Queue {

    Node head; //начало списка, новый элемент добавляется ссылкой на следующий элемент к последнему элементу списка
    Node tail; //ссылка на последний элемент

    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }

    public Integer peak(){
        Integer result = null;
        if(tail != null){
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }


    public class Node {
        int value;
        Node next;
        Node previous;
    }
}