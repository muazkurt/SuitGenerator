package company.incorporated.zirhsan.DecoratorPattern;

public class Laser extends Accessories
{
	public Laser(Component suit)
	{
		_componentName = Accessory.Laser;
		_weight = 5500;
		_cost = 200000;
		_suit = suit;
	}
}
