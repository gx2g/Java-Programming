/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dehkhoda_abbas
 */
public class ShowInteface {

    public static void main(String [] args)
    {
        Programmer pg = new Programmer();
        Manager mg = new Manager();
        System.out.println("Programmer gets :"+PayRoll.computeSal(pg));
        System.out.println("Manager gets :"+PayRoll.computeSal(mg));

    }

}
class Programmer implements Emp
{
    private double sal = 60000.0;
    private double bonus = 10000.0;

    public double getSal()
    {
        return sal;
    }
    public double getBonus()
    {
        return bonus;
    }
}

class Manager implements Emp
{
    private double sal = 40000.0;


    public double getSal()
    {
        return sal;
    }
    public double getBonus()
    {
        return 0.0;
    }
}

class PayRoll
{
    public static double computeSal(Emp e)
    {
// Note commented area is when we have
// in Emp interface only on signiture
// public double getSal();
// and PayRoll wants to pay bonus
// to programmer.
// 1. must check to make sure it is
// instanceof prgrammer then
// 2. downcast to call method getBonus()
// when we add public double getBonus();
// then job of payroll is to just return
// e.getSal()+ e.getBonus();



/**********************************
 double money = 0.0;
 if(e instanceof Programmer)
 {
 money += ((Programmer)e).getBonus();
 }
 return e.getSal()+ money;
 ***********************************/

        return e.getSal()+ e.getBonus();
    }

}



interface Emp
{
    public double getSal();
    public double getBonus();
}