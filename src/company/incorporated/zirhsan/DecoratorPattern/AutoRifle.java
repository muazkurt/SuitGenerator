package company.incorporated.zirhsan.DecoratorPattern;

/**
 * An AutoRifle class extends Accessories.
 * Its an accessories so it must have a component in item.
 */
public class AutoRifle extends Accessories
{
	/**
	 * Creates a AutoRifle object and wrap it on given suit_input.
	 * @param suit_input is a Component that can be just a component or some accessories with components.
	 */
	public AutoRifle(Component suit_input)
	{
		_componentName = Accessory.AutoRifle;
		_weight = 1500;
		_cost   = 30000;
		_suit   = suit_input;
	}
}
