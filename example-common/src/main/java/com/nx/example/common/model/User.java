package com.nx.example.common.model;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author nx
 */
public class User implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
