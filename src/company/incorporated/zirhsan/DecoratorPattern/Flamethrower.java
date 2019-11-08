package company.incorporated.zirhsan.DecoratorPattern;

public class Flamethrower extends Accessories
{
	public Flamethrower(Component suit)
	{
		_componentName = Accessory.FlameThrower;
		_weight = 2000;
		_cost = 50000;
		_suit = suit;
	}
}
