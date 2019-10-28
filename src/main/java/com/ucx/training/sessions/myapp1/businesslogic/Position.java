package com.ucx.training.sessions.myapp1.businesslogic;

public enum Position {
    PM(5), PROGRAMMER(2), QA(3), DEVOPS(4);

    private double wage;

    Position(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
