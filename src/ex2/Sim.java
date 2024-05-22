package ex2;

public class Sim {

    //attributes
    private final byte credit;
    private int number;
    private Calls[] calls;

    //constructor
    public Sim(int number) {
        this.number = number;
        this.credit = 0;
        this.calls = new Calls[5];
        for (int i = 0; i < calls.length; i++) {
            calls[i] = new Calls();
        }
    }

    //method
    public void printSimInfo() {
        System.out.println("Sim info:");
        System.out.println("Phone number: " + number);
        System.out.println("Credit: " + credit + "€");
        System.out.println("Calls: ");
        for (int i = 0; i < calls.length; i++) {
            Calls call = calls[i];
            System.out.println(call.getNumber() + ", " + call.getDuration() + "m");
        }
    }

    //encapsulation
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public byte getCredit() {
        return credit;
    }

    public Calls[] getCalls() {
        return calls;
    }
}
