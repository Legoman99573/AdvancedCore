package com.Ben12345rocks.AdvancedCore.Listeners;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Ben12345rocks.AdvancedCore.TimeChecker.TimeType;

// TODO: Auto-generated Javadoc
/**
 * The Class DayChangeEvent.
 */
public class PreDateChangedEvent extends Event {

	/** The Constant handlers. */
	private static final HandlerList handlers = new HandlerList();

	/**
	 * Gets the handler list.
	 *
	 * @return the handler list
	 */
	public static HandlerList getHandlerList() {
		return handlers;
	}

	private TimeType timeType;

	public PreDateChangedEvent(TimeType time) {
		super(true);
		this.timeType = time;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.bukkit.event.Event#getHandlers()
	 */
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	/**
	 * @return the timeType
	 */
	public TimeType getTimeType() {
		return timeType;
	}

	/**
	 * @param timeType
	 *            the timeType to set
	 */
	public void setTimeType(TimeType timeType) {
		this.timeType = timeType;
	}

}
