package com.company;

public class Holder {

    private int AccNumber;
    private String NameHolder;
    private double Balance;
    static double Rate = 5.00;

    public Holder(int accNumber, String nameHolder, double balance) {
        AccNumber = accNumber;
        NameHolder = nameHolder;
        Balance = balance;
    }

    public void DepositMoney(double deposit) {
        Balance = Balance + deposit;
    }

    public void WithdrawMoney(double withdraw) {
        Balance = Balance - (withdraw + Rate);
    }


    public int getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(int accNumber) {
        AccNumber = accNumber;
    }

    public String getNameHolder() {
        return NameHolder;
    }

    public void setNameHolder(String nameHolder) {
        NameHolder = nameHolder;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String ToString() {
        return (
                "Conta: "
                        + AccNumber
                        + ", Titular: "
                        + NameHolder
                        + ", Saldo: "
                        + String.format("%.2f", Balance)
        );
    }
}
