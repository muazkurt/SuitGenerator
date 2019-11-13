package company.incorporated.zirhsan.DecoratorPattern;

/**
 * This is a main component Dec extends Component.
 */
public class Dec extends Component{

	/**
	 * Creates a Dec component with its own parameters.
	 */
	public Dec()
	{
		_componentName = Suit.Dec;
		_weight  = 25000;
		_cost    = 500000;
	}

}
