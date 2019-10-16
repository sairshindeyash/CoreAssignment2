package com.yash.assignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable  
{ 
    
    public static Singleton instance = new Singleton(); 
      
    private Singleton()  
    { 
        
    } 
      
    
    protected Object readResolve() 
    { 
        return instance; 
    } 
} 
public class PreventSingletonSerialization {

	public static void main(String[] args)  
    { 
        try
        { 
            Singleton instance1 = Singleton.instance; 
            ObjectOutputStream out  
                = new ObjectOutputStream(new FileOutputStream("file.text")); 
            out.writeObject(instance1); 
            out.close(); 
          
            // deserailize from file to object 
            ObjectInputStream in  
                = new ObjectInputStream(new FileInputStream("file.text")); 
            Singleton instance2 = (Singleton) in.readObject(); 
            in.close(); 
          
            System.out.println("instance1 hashCode:- "
                                           + instance1.hashCode()); 
            System.out.println("instance2 hashCode:- "
                                           + instance2.hashCode()); 
        }  
          
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
    } 
}
