/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author MinhCht
 */
public class AmaraMng {
    FlowerService flowerService = new FlowerService();
    PhoneService phoneService = new PhoneService();
    VehicleService vehicleService = new VehicleService();

    public AmaraMng() {
    }
    
    public void initFlower(FlowerService input){
        this.flowerService = input;
    }
    
    public void initPhone(PhoneService input){
        this.phoneService = input;
    }
    
    public void initVehicle(VehicleService input){
        this.vehicleService = input;
    }
    
    public void addVehicleHours(float hours){
        this.vehicleService.addHours(hours);
    }
    
    public void addPhoneMinutes(float minutes){
        this.phoneService.addMinutes(minutes);
    }
    
    public void addFlowerTimes(int times){
        this.flowerService.addTimes(times);
    }
    
    public String getHighestAmount(){
        if (this.flowerService.getAmount() > this.vehicleService.getAmount()){
            if (this.flowerService.getAmount() > this.phoneService.getAmount()){
                return "Flower Service is the highest";
            }
            else{
                return "Phone Service is the highest";
            }
        }
        else if (this.vehicleService.getAmount() > this.phoneService.getAmount()){
            return "Vehicle service is the highest";
        }
        else{
            return "Phone service is the highest";
        }
    }
    public float getAllAmount(){
        return (this.flowerService.getAmount() + this.vehicleService.getAmount() + this.phoneService.getAmount());
    }
}
