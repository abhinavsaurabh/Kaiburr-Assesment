package com.cagataygurturk.models;

import com.cagataygurturk.storage.Storable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class Server implements Serializable, Storable {

    protected String name;

    protected int id;

    protected String language;

    protected long framework;

    public Server(String name, int id, String language,String framework) {
        this.name = name;
        this.id = id;
        this.language = language;
        this.framework = framework;
    }



   @JsonProperty("name")
    public String getName() {
        return amount;
    }
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    public Server setId(int id) {
        this.id = id;
        return this;
    }

    public Server setlanguage(String language) {
        this.language = language;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return type;
    }




    @JsonIgnore
    public string framework() {
        return this.getFramework();
    }

    public void frameowrk(String framework) {
        this.framework = framework;
    }
}
