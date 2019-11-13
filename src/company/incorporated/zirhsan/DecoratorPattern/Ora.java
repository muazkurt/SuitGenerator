package company.incorporated.zirhsan.DecoratorPattern;

/**
 * This is a main component Ora extends Component.
 */
public class Ora extends Component
{

    /**
     * Creates an Ora component with its own parameters.
     */
    public Ora()
    {
        _componentName = Suit.Ora;
        _weight  = 30000;
        _cost    = 1500000;
    }
}
