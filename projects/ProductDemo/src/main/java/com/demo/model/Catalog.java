package com.demo.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Hue on 10/22/2016.
 */
@Entity
@Table(name = "catalog")
public class Catalog {

    @Id
    @GeneratedValue
    private Set<Catalog> cataId;
    private String cataName;

    public Set<Catalog> getCataId() {
        return cataId;
    }

    public void setCataId(Set<Catalog> cataId) {
        this.cataId = cataId;
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName;
    }
}
