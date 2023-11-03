class compound{
    public  double calc(int i,int t,int r,int n){
        
        return (i*((1+((r/100)/n))^(n*t)));
    }
}
class Aaa{
    public static void main(String[] args) {
        compound mycompound=new compound();
        double result=mycompound.calc(500000,18,3,12);
        System.out.println("result:"+ result);
    }
}


    

