package company.incorporated.zirhsan.DecoratorPattern;

public abstract class Component
{
	int _weight;
	int _cost;
	Enum _componentName;
	public int weight()
	{
		System.out.print(_componentName + ". ");
		return _weight;
	}
	public int cost()
	{
		System.out.print(_componentName + ", ");
		return _cost;
	}
}
