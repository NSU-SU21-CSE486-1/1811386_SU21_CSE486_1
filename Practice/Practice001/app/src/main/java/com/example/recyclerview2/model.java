package com.example.recyclerview2;

public class model {
 public String name;
    public String nid;

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

    public model(String name, String nid) {
        this.name = name;
        this.nid = nid;
    }
}
