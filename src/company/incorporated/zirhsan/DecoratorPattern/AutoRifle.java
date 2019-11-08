package company.incorporated.zirhsan.DecoratorPattern;

public class AutoRifle extends Accessories
{
	public AutoRifle(Component suit_input)
	{
		_componentName = Accessory.AutoRifle;
		_weight = 1500;
		_cost   = 30000;
		_suit   = suit_input;
	}
}
