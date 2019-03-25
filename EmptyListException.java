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
public class EmptyListException extends RuntimeException {
    public EmptyListException(){
        this("List");
    }
    
    public EmptyListException(String name){
        super(name+ "is empty");
    }
    
}
