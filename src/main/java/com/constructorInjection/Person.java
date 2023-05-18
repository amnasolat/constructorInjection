package com.constructorInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Person {

    private String personName;
    private int personId;
    private Address personAddress;
    private List<String> personSkills;

    public Person(String personName, int personId, Address personAddress, List<String> personSkills) {
        this.personName = personName;
        this.personId = personId;
        this.personAddress= personAddress;
        this.personSkills=personSkills;
    }

    public Person() {
        super();
    }
    @PostConstruct
    public void start(){
        System.out.println("init-method");
    }
    @PreDestroy
    public void end(){
        System.out.println("destroy-method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + this.personName + '\'' +
                ", personId=" + this.personId +
                ", personAddress=" + this.personAddress +
                ", personSkills=" + this.personSkills +

                '}';
    }
}
