package com.example.myapplication;

public class Model {
    public Model(String name, String nid) {
        this.name = name;
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    String name,nid;

}