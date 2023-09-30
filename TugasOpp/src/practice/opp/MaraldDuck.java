/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

/**
 *
 * @author LENOVO
 */
public class MaraldDuck extends Duck{
    public MaraldDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
       
    }
    
    @Override
    public void display(){
        System.out.println("Im real MaraldDuck");
    }
}
