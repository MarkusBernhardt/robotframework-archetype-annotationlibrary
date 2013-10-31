package ${package}.exceptions;

/**
 * A raised exception of this type marks the step as failed, but does not end
 * all test executions.
 */
@SuppressWarnings("serial")
public class ${libraryName}NonFatalException extends RuntimeException {

	/**
	 * Mark this exception as non fatal
	 */
	public static final boolean ROBOT_EXIT_ON_FAILURE = false;

	public ${libraryName}NonFatalException() {
		super();
	}

	public ${libraryName}NonFatalException(String string) {
		super(string);
	}

	public ${libraryName}NonFatalException(Throwable t) {
		super(t);
	}

	public ${libraryName}NonFatalException(String string, Throwable t) {
		super(string, t);
	}
}
