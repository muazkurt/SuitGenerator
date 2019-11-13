package company.incorporated.zirhsan.DecoratorPattern;

/**
 * Creates an empty suit to avoid Null Pointer Exception. It doesnt'c creatable outside of the package.
 */
class NullSuit extends Component
{
	NullSuit()
	{
		_weight = 0;
		_cost   = 0;
	}
}
