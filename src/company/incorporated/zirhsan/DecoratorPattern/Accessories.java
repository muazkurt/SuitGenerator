package company.incorporated.zirhsan.DecoratorPattern;

public abstract class Accessories extends Component
{
	Component _suit = new NullSuit();

	@Override
	public int weight()
	{
		return super.weight() + _suit.weight();
	}

	@Override
	public int cost()
	{
		return super.cost() + _suit.cost();
	}
}
