import java.util.Iterator;

public class Parent extends TokenManager
{
	/* Variables */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8943726113930609846L;

	/*Constructors */
	public Parent(String name) 
	{
		super(name);
	}
	
	public void addChild(String childName)
	{
		children.add(new Child(childName, this));
	}
	
	public void editChild(String childName, String newName)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		
		for (Child child : children)
		{
			if (child.getName().equals(childName))
			{
				child.setName(newName);
				break;
			}
		}
	}
	
	public void deleteChild(String childName)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		
		Iterator<Child> it = children.iterator();
		while (it.hasNext())
		{
			Child child = it.next();
			if (child.getName().equals(childName))
			{
				it.remove();
			}
		}
	}
	
	public void addToken(String childName, String tokenName)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		getChild(childName).getCurrentMode().addToken(tokenName);
	}
	
	public void editToken(String childName, String tokenName, String newTokenName)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		getChild(childName).getCurrentMode().editToken(tokenName, newTokenName);
	}
	
	public void deleteToken(String childName, String tokenName)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		getChild(childName).getCurrentMode().deleteToken(tokenName);
	}
	
	public void addTokenAccu(String childName, int amount, int interval)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		getChild(childName).getCurrentMode().setTokenAccu(amount, interval);
	}
	
	public void addReward(String childName, String rewardName, int rewardCost)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		getChild(childName).getCurrentMode().addReward(rewardName, rewardCost);
	}
	
	public void editReward(String childName, String rewardName, String newName, int newRewardCost)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		getChild(childName).getCurrentMode().editReward(rewardName, newName, newRewardCost);
	}
	
	public void deleteReward(String childName, String rewardName)
	{
		if (getChild(childName) == null)
		{
			System.out.println("There is no child with that name!\n");
			return;
		}
		getChild(childName).getCurrentMode().deleteReward(rewardName);
	}
}
