package practices.microservice.common.exception;
/**
 * 
 * @author bwang
 *
 */
public final class ProviderNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1;

	public ProviderNotFoundException(String msg) {
		super(msg);
	}
}