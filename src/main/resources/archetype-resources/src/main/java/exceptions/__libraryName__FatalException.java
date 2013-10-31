package ${package}.exceptions;

/**
 * A raised exception of this type ends all test executions.
 */
@SuppressWarnings("serial")
public class ${libraryName}FatalException extends RuntimeException {

	/**
	 * Mark this exception as fatal
	 */
	public static final boolean ROBOT_EXIT_ON_FAILURE = true;

	public ${libraryName}FatalException() {
		super();
	}

	public ${libraryName}FatalException(String string) {
		super(string);
	}

	public ${libraryName}FatalException(Throwable t) {
		super(t);
	}

	public ${libraryName}FatalException(String string, Throwable t) {
		super(string, t);
	}
}
