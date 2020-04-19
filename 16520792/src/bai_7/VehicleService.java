/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

public class VehicleService {
    private float amount = 0;
    private float price = 0;
    private float hours = 0;

    public VehicleService() {
    }
    
    public VehicleService(float price) {
        this.price = price;
    }
    
    public void addHours(float hours){
        this.hours += hours;
        this.amount = (this.hours * price) * ((this.hours > 72)?(float)0.931:(this.hours > 6)?(float)0.95:1);
//        System.out.println(this.amount);

    }
    
    public float getAmount(){
        return this.amount;
    }
    
}
