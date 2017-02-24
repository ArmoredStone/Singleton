package pkg11;

/**
 *
 * @author Lesha
 */
public class Earth {

    public static final Earth HOLDER_INSTANCE = new Earth();

    private Earth() {
    }

    public static Earth getInstance() {
        return Earth.HOLDER_INSTANCE;
    }

}
