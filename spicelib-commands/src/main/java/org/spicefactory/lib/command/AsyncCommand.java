package org.spicefactory.lib.command;

import org.spicefactory.lib.command.events.CommandEvent;
import org.spicefactory.lib.command.events.CommandResultEvent;
import org.spicefactory.lib.event.IEventDispatcher;
import org.spicefactory.lib.event.EventListener;
import org.spicefactory.lib.event.annotation.Event;
import org.spicefactory.lib.event.annotation.Events;

/**
 * Represents a command that executes asynchronously.
 * @author Sylvain Lecoy <sylvain.lecoy@swissquote.ch>
 */
@Events({@Event(type = CommandResultEvent.class, id = CommandResultEvent.COMPLETE),
		@Event(type = CommandResultEvent.class, id = CommandResultEvent.COMPLETE)})
public interface AsyncCommand extends Command, IEventDispatcher<EventListener<CommandEvent>> {

	/**
	 * Indicates whether this command is currently executing.
	 */
	boolean isActive();
}
