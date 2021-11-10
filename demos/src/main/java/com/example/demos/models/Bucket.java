package com.example.demos.models;

import   javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.PrivateKey;

@Entity
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String loginb, adress, names, sum;



    public Long getIds(){
        return id;
    }

    public void  setIds(Long id){
        this.id = id;
    }

    public String getLoginb(){
        return loginb;
    }

    public  void setLoginb(String loginb){
        this.loginb = loginb;
    }

    public String getAdress(){
        return adress;
    }

    public  void setAdress(String adress){
        this.adress = adress;
    }

    public String getNames(){
        return names;
    }

    public  void setNames(String names){
        this.names = names;
    }

    public String getSum(){
        return sum;
    }

    public  void setSum(String sum){
        this.sum = sum;
    }

    public Bucket() {

    }

    public Bucket(String loginb, String adress,String names,String sum) {
        this.loginb = loginb;
        this.adress = adress;
        this.names = names;
        this.sum = sum;
    }
}
