package Fundamentals.Classes.Herencia.domain;

import java.util.Date;

public class Client extends Person {
    private int clientID;
    private Date registerDate;
    private boolean vip;
    private static int autoincrementID;

    public Client() {
        this.clientID = 1;
    }


    public Client(String name, char gender, int age, String address, Date registerDate, boolean vip) {
        super(name, gender, age, address);
        this.clientID = ++Client.autoincrementID;
        this.registerDate = registerDate;
        this.vip = vip;
    }

    public int getClientID() {
        return this.clientID;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Client [clientID=" + clientID + ", registerDate=" + registerDate + ", vip=" + vip + "]";
    }
}