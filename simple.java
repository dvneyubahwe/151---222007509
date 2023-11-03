class SimpleInterest
{
    public double Calculate(double principal, double rate, double time)
    {
        return principal*rate*time;
    }
}
class Objects {
    public static void main (String [] args){
 SimpleInterest mySI = new SimpleInterest();
 double result = mySI.Calculate(100000,0.05 ,5);
 System.out.println(" Result: " + result);
    }
}

