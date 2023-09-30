/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.opp;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Duck> arrayD = new ArrayList<>();
        
        arrayD.add(new DecoyDuck());
        arrayD.add(new MaraldDuck());
        arrayD.add(new ModelDuck());
        arrayD.add(new RedHeadDuck());
        arrayD.add(new RubberDuck());
        
        System.out.println("Silahkan Pilih Jenis Bebeknya : ");
        for (int i = 0; i < arrayD.size(); i++) {
            System.out.println((i + 1) + ". " + arrayD.get(i).getClass().getSimpleName());
        }
        int angka = sc.nextInt();
        
        if(angka >= 1 && angka <= arrayD.size() ){
             Duck selectedDuck = arrayD.get(angka - 1);
            System.out.println("Kamu telah memilih " + selectedDuck.getClass().getSimpleName());
            selectedDuck.display();
            selectedDuck.perfomFly();
            selectedDuck.performQuack();
            selectedDuck.swim();
        }else{
             System.out.println("Pilihan kamu tidak valid");
        }
        sc.close();
    }
}
