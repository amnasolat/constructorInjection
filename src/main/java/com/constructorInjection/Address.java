package com.constructorInjection;

public class Address {
    private String residence;
    private String number;
    public Address(String residence, String number) {
        super();
        this.residence = residence;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "residence='" + this.residence + '\'' +
                ", number='" + this.number + '\'' +
                '}';
    }
}
