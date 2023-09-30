/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

/**
 *
 * @author LENOVO
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
        
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQueckBehavior(QuackBehavior qc){
        quackBehavior = qc;
    }
    
    abstract void display();
    
    public void perfomFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("All duck floats, even dedoys");
    }
}
