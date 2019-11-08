package company.incorporated.zirhsan.DecoratorPattern;

public class RocketLauncher extends Accessories
{
	public RocketLauncher(Component suit)
	{
		_componentName = Accessory.RocketLauncher;
		_weight = 7500;
		_cost = 150000;
		_suit = suit;
	}
}
