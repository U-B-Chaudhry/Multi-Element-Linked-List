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
public class List<T> {
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name;
    
    public List(){
        this("nodelist");
    }
    
    public List(String listName){
        name = listName;
        firstNode = lastNode = null;
    }
    
    public void insertAtFront(T insertItem,T insertItem2){
        if(isEmpty())
            firstNode = lastNode = new ListNode<T>(insertItem, insertItem2);
        else
            firstNode = new ListNode<T>(insertItem, insertItem2, firstNode);
    }
    
    public void insertAtBack(T insertItem,T insertItem2){
        if(isEmpty())
            firstNode = lastNode = new ListNode<T>(insertItem, insertItem2);
        else
            lastNode = lastNode.nextNode = new ListNode<T>(insertItem, insertItem2, firstNode);
    }
    
    public T removeFromFront() throws EmptyListException{
        if(isEmpty())
            throw new EmptyListException(name);
        
        T removedItem = firstNode.data1;
        T removedItem2 = firstNode.data2;
        
        if(firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;
        
        return removedItem;
    }
    
    public T removeFromBack() throws EmptyListException{
        if(isEmpty())
            throw new EmptyListException(name);
        
        T removedItem = lastNode.data1;
        
        if(firstNode == lastNode)
            firstNode = lastNode = null;
        else{
            ListNode<T> current = firstNode;
            
            while(current.nextNode != lastNode)
                current = current.nextNode;
            
            lastNode = current;
            current.nextNode = null;
        }
        
        return removedItem;
    }
    
    public boolean isEmpty(){
        return firstNode == null;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.printf("Empty %s\n", name);
            return;
        }
        
        System.out.printf("The %s is:", name);
        ListNode<T> current = firstNode;
        
        while(current != null){
            System.out.printf("%s ", current.data1);
            current = current.nextNode;
        }
        
        System.out.println("\n");
    }
    
}
