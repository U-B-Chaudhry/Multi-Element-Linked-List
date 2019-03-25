/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listtest;

import java.util.*;

/**
 *
 * @author Romy
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of nodes you would like to create");
        int count = input.nextInt();
        int nodeid=5000;

        List<Integer> list = new List<Integer>();
        for(int i = 0; i < count; i++){
            list.insertAtBack(nodeid,count);
            list.print();
            nodeid++;
        }
        /*
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        list.print();
        */
        for(int i = 0; i < count; i++){
                  
            try{
                
                int removedItem = list.removeFromFront();
                System.out.printf("\n%d removed\n", removedItem);
                list.print();
            /*
                removedItem = list.removeFromFront();
                System.out.printf("\n%d removed\n", removedItem);
                list.print();
            
                removedItem = list.removeFromBack();
                System.out.printf("\n%d removed\n", removedItem);
                list.print();
            
                removedItem = list.removeFromBack();
                System.out.printf("\n%d removed\n", removedItem);
                list.print();
            */    
            }
            catch(EmptyListException emptyListException){
                emptyListException.printStackTrace();
            }
        }
    }
    
}
