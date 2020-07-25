import java.util.*;

class SimpleAndCompoundInterest
{
    public double simpleInterest(double pr, double rate, double time)
	{
		double simple;
				
		simple=(pr * time * rate)/100;
		
		return(simple);
	}
	public double compoundInterest(double pr, double rate, double time)
	{
		double compound;
				
		compound=pr * Math.pow(1.0+rate/100.0,time) - pr;
		
		return(compound);
	}
}
