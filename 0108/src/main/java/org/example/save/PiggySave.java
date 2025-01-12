package org.example.save;

public class PiggySave {

    private int total;

    public void deposit(int amount) {
        this.total += amount;
    }

    public int withcraw() {

        int result = this.total;
        this.total = 0;

        return result;
    }

}
