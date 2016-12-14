package com.tongdun.velocitytest.model;

/**
 * Created by trc on 16/12/14.
 */
public class User {
    private String name;
    private String age;
    private String id;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }
}

