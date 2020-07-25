import java.util.*;

class HomeConstructionCost
{
    public double constructionCost(String hstandard, double area, boolean automated)
	{
		double cost=0;
		if(hstandard == "standard" && automated==false)
		{
			cost = area*1200;
		}
		else
		if(hstandard == "above standard" && automated==false)
		{
			cost = area*1500;
		}
		else
		if(hstandard == "high standard" && automated==false)
		{
			cost = area*1800;
		}
		else
		if(hstandard == "high standard" && automated==true)
		{
			cost = area*2500;
		}
		return cost;
	}	
}
