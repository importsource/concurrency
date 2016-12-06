/**
 * 
 */
package com.importsource.concurrency;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * @author Hezf
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AtomicReferenceFieldUpdater<Dog, String> updater=AtomicReferenceFieldUpdater.newUpdater(Dog.class,String.class,"name");
        Dog dog=new Dog();
        updater.compareAndSet(dog, dog.name, "newdog");
        
        
        System.out.println(dog.name);
        
	}

}

class Dog{
	volatile String name="dog1";
}
