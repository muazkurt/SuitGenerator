package company.incorporated.zirhsan;

import com.sun.istack.internal.NotNull;
import company.incorporated.zirhsan.DecoratorPattern.*;

/**
 * Ths is the SuitGenerator main class of the project.
 * With this class, user can generate just a default Suit or any combination of Accessories with a Suit
 */
public class SuitGenerator
{
	/**
	 * Creates a suit with given Enum info.
	 * @param input An enum type info.
	 * @return a new generated component/suit.
	 * @throws Exception Null parameter.
	 */
	public Component generateSuit(@NotNull Suit input) throws Exception
	{
		if(null == input)
			throw new Exception("Null input.");
		Component cmp;
		switch (input)
		{
			case Dec:
				cmp = new Dec();
				break;
			case Ora:
				cmp = new Ora();
				break;
			default:
				cmp = new Tor();
				break;
		}
		return cmp;
	}

	/**
	 * Gives a suit or a suit with any combinations of Accessories, and an Enum to declare the
	 * type of an adding Accessory to apply it.
	 * @param input a suit or a suit with any combinations of Accessories
	 * @param to_add an Enum to declare the type of an adding Accessory
	 * @return a new combination.
	 */
	public Component addAccessories(@NotNull Component input, @NotNull Accessory to_add)
	{
		switch (to_add)
		{
			case Laser:
				input = new Laser(input);
				break;
			case AutoRifle:
				input = new AutoRifle(input);
				break;
			case FlameThrower:
				input = new Flamethrower(input);
				break;
			case RocketLauncher:
				input = new RocketLauncher(input);
		}
		return input;
	}
}
