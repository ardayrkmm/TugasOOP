/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

/**
 *
 * @author LENOVO
 */
public class DecoyDuck extends Duck {
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQueckBehavior(new MuteQuack());
    }
    @Override
    public void display(){
        System.out.println("Im duck Decoy");
    }
}
