package company.incorporated.zirhsan.DecoratorPattern;

/**
 * Main salable product of the system. Any item in the project is going to extend from this.
 */
public abstract class Component
{
	// weight of the product.
	int _weight;
	// cost of the product.
	int _cost;
	// Name of the product, Enum because of ease of usage.
	Enum _componentName;

	/**
	 * getter for the weight of the component
	 * @return component weight.
	 */
	public int weight()
	{
		System.out.print(_componentName + ". ");
		return _weight;
	}

	/**
	 * getter for the cost of the component
	 *
	 * @return component cost.
	 */
	public int cost()
	{
		System.out.print(_componentName + ", ");
		return _cost;
	}
}
