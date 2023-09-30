/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

/**
 *
 * @author LENOVO
 */
public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = () -> System.out.println("SQuack");
    }
    public RubberDuck(FlyBehavior flybehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flybehavior;
        this.quackBehavior = quackBehavior;
        
    }
    
    @Override
    public void display(){
        System.out.println("Im a Rubber Duckie");
    }
}
