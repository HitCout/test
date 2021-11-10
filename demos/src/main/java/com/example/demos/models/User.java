package com.example.demos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String login, pass, fio, nomer, adress;

    public Long getId(){
        return id;
    }

    public void  setId(Long id){
        this.id = id;
    }

    public String getLogin(){
        return login;
    }

    public  void setLogin(String login){
        this.login = login;
    }

    public String getPass(){
        return pass;
    }

    public  void setPass(String pass){
        this.pass = pass;
    }

    public String getFio(){
        return fio;
    }

    public  void setFio(String fio){
        this.fio= fio;
    }

    public String getNomer(){
        return nomer;
    }

    public  void setNomer(String nomer){
        this.nomer = nomer;
    }

    public String getAdress(){
        return adress;
    }

    public  void setAdress(String adress){
        this.adress = adress;
    }



    public User() {
    }

    public User(String login, String pass,String fio, String nomer,String adress) {
        this.login = login;
        this.pass = pass;
        this.fio = fio;
        this.nomer = nomer;
        this.adress = adress;
    }
}
