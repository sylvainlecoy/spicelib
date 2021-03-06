package org.spicefactory.lib.command;

/**
 * Represents the result of a command execution
 * @author Sylvain Lecoy <sylvain.lecoy@swissquote.ch>
 */
public interface CommandResult {

	/**
	 * The command that produced the result.
	 */
	Object command();

	/**
	 * The actual result value.
	 */
	Object getValue();

	/**
	 * Whether the command completed successfully.
	 * <p>
	 * If this flag is false, the value property represents the error thrown or dispatched by the command.
	 */
	boolean complete();

}
