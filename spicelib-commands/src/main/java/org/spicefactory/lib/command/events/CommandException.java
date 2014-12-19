package org.spicefactory.lib.command.events;

import java.text.MessageFormat;

import org.spicefactory.lib.command.Command;
import org.spicefactory.lib.command.CommandExecutor;

public class CommandException extends Exception {

	/////////////////////////////////////////////////////////////////////////////
	// Package-private.
	/////////////////////////////////////////////////////////////////////////////

	/////////////////////////////////////////////////////////////////////////////
	// Public API.
	/////////////////////////////////////////////////////////////////////////////

	public CommandException(CommandExecutor executor, Command target, Throwable cause) {
		super(MessageFormat.format("Execution of {} failed, target command {} failed.", executor), cause);
	}

	/////////////////////////////////////////////////////////////////////////////
	// Internal implementation.
	/////////////////////////////////////////////////////////////////////////////
}