package company.incorporated.zirhsan.DecoratorPattern;

/**
 * An RocketLauncher class extends Accessories.
 * Its an accessories so it must have a component in item.
 */
public class RocketLauncher extends Accessories
{
	/**
	 * Creates a RocketLauncher object and wrap it on given suit_input.
	 *
	 * @param suit is a Component that can be just a component or some accessories with components.
	 */
	public RocketLauncher(Component suit)
	{
		_componentName = Accessory.RocketLauncher;
		_weight = 7500;
		_cost = 150000;
		_suit = suit;
	}
}
