/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listtest;

/**
 *
 * @author Romy
 */
class ListNode<T> {
    T data1;
    T data2;
    ListNode<T> nextNode;
    
    ListNode(T object1, T object2){
        this(object1, object2, null);
    }
    
    ListNode(T object1, T object2, ListNode<T> node){
        data1 = object1;
        data2 = object2;
        nextNode = node;
    }
    
    T getData(){
        return data1;
    }
    
    ListNode<T> getNext(){
        return nextNode;
    }
}
