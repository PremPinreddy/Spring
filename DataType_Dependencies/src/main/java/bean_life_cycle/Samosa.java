package bean_life_cycle;

public class Samosa {

	private int cost;

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("Setter injection");
	}

	public int getCost() {
		return cost;
	}
	
	Samosa()
	{
	}
    
	@Override
	public String toString()

	{
		return "Samosa Cost:"+cost+"/- rupees";
	}
	
	public void init()
	{
		System.out.println("inside Samosa init method");
	}
	public void destroy()
	{
		System.out.println("inside Samosa destroy method");
	}
	
	
}
