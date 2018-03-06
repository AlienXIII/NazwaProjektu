/**
 * Created by hp on 05.03.2018.
 */



public class Employee extends Osoba{
    private String dzial;

    public String getDzial(){
        return dzial;
    }

    public void setDzial(String dzial) {
        this.dzial = dzial;
    }
    private int payroll;

    public int getpayroll(){
        return payroll;
    }

    public void setpayroll(int payroll) {
        this.payroll = payroll;
    }
}