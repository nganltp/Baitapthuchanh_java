/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

public class PhoneService {
    float amount = 0;
    float price = 0;
    float minutes = 0;

    public PhoneService(float price) {
        this.price = price;
    }

    public PhoneService() {
    }
    
    public void addMinutes(float minutes){
        this.minutes += minutes;
        this.amount = (this.minutes * this.price) * ((this.minutes * this.price) > 300000?(float)0.8:1);
//        System.out.println(this.amount);
    }
    
    public float getAmount(){
        return this.amount;
    }
}
