/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

import java.util.Scanner;

/**
 *
 * @author MinhCht
 */
public class ServiceAmara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        AmaraMng manager = new AmaraMng();
        
        System.out.println("Input price vehicle:");
        manager.initVehicle(new VehicleService(input.nextFloat()));
        
        System.out.println("Input hours rent vehicle:");
        manager.addVehicleHours(input.nextFloat());
        
        System.out.println("Input price flower:");
        manager.initFlower(new FlowerService(input.nextFloat()));
        
        System.out.println("Input times of flower:");
        manager.addFlowerTimes(input.nextInt());
        
        System.out.println("Input price phone:");
        manager.initPhone(new PhoneService(input.nextFloat()));
        
        System.out.println("Input minutes on phone:");
        manager.addPhoneMinutes(input.nextFloat());
        
        System.out.println(manager.getHighestAmount());
        System.out.println("Total Amount="+manager.getAllAmount());
    }
    
}
