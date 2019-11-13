package company.incorporated.zirhsan.DecoratorPattern;

/**
 * This is a abstract Accessories class that extends from Component.
 * This is the general form of the any suit accessories.
 * @see company.incorporated.zirhsan.DecoratorPattern.Component
 */
public abstract class Accessories extends Component
{
	/**
	 * Component item of the Accessories because it is meaningless without any.
	 * Initial value is NullSuit because avoiding Null Pointer Exception.
	 */
	Component _suit = new NullSuit();

	/**
	 * Overrides the weight method, because now weight is also dependent on _suit component.
	 * @return Weight of his Accessories and its main component.
	 */
	@Override
	public int weight()
	{
		return super.weight() + _suit.weight();
	}

	/**
	 * Overrides the weight method, because now weight is also dependent on _suit component.
	 * @return Cost of his Accessories and its main component.
	 */
	@Override
	public int cost()
	{
		return super.cost() + _suit.cost();
	}
}
