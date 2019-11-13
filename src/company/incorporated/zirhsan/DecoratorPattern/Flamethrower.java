package company.incorporated.zirhsan.DecoratorPattern;

/**
 * An Flamethrower class extends Accessories.
 * Its an accessories so it must have a component in item.
 */
public class Flamethrower extends Accessories
{
	/**
	 * Creates a Flamethrower object and wrap it on given suit_input.
	 *
	 * @param suit is a Component that can be just a component or some accessories with components.
	 */
	public Flamethrower(Component suit)
	{
		_componentName = Accessory.FlameThrower;
		_weight = 2000;
		_cost = 50000;
		_suit = suit;
	}
}
