package company.incorporated.zirhsan.DecoratorPattern;

/**
 * An Laser class extends Accessories.
 * Its an accessories so it must have a component in item.
 */
public class Laser extends Accessories
{
	/**
	 * Creates a Laser object and wrap it on given suit_input.
	 *
	 * @param suit is a Component that can be just a component or some accessories with components.
	 */
	public Laser(Component suit)
	{
		_componentName = Accessory.Laser;
		_weight = 5500;
		_cost = 200000;
		_suit = suit;
	}
}
