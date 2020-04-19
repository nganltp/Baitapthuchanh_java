/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;


public class FlowerService {
    float amount = 0;
    float price = 0;
    int times = 0;

    public FlowerService(float price) {
        this.price = price;
    }

    public FlowerService() {
    }
    
    public void addTimes(int times){
        this.times += times;
        this.amount = (this.times * this.price);
//        System.out.println(this.amount);

    }
    
    public float getAmount(){
        return this.amount;
    }
}
