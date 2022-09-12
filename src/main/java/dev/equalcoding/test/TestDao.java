package dev.equalcoding.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestDao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String property;

    public TestDao(Integer id, String property) {
        this.id = id;
        this.property = property;
    }

    public TestDao() {
    }

    public TestDao(String property) {
        this.property = property;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}


