package company.incorporated.zirhsan;

import com.sun.istack.internal.NotNull;
import company.incorporated.zirhsan.DecoratorPattern.*;

public class SuitGenerator
{
	public SuitGenerator()
	{}

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
