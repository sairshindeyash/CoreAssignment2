package com.yash.assignment2;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class PreventSingletonSerializationTest {
	PreventSingletonSerialization preventSingletonSerialization=new PreventSingletonSerialization();
	
	@Test
	public void shouldNotCreateNewInstanceAfterDeserializingObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		
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
        
        assertEquals(instance1.hashCode(), instance2.hashCode());
		
	}
	
}
