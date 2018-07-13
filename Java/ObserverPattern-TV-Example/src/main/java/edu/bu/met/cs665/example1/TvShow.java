package edu.bu.met.cs665.example1;

import java.util.ArrayList;

public class TvShow implements PublisherBase {
	
	private String name;
	
	private String latestEpisode;
	
	private ArrayList<SubscriberBase> subscribers = new ArrayList<SubscriberBase>();
	
	public TvShow(String name) {
		this.name = name;
		this.latestEpisode = "Episode 1";
	}
	
	String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLatestEpisode(String latestEpisode) {
		this.latestEpisode = latestEpisode;
		notifySubscribers();
	}
	
	public String getLatestEpisode() {
		return this.latestEpisode;
	}
	
	/*
	 *  Add subscriber to the Arraylist of subscribers
	 */
	public void subscribe(SubscriberBase o) {
		subscribers.add(o);
	}
	
	/*
	 * Remove subscriber to the Arraylist of subscribers
	 */
	public void unsubscribe(SubscriberBase o) {
		subscribers.remove(o);
	}
	
	/*
	 * Call the update() on each subscriber when the data changes
	 */
	public void notifySubscribers() {
		for (SubscriberBase o : subscribers) {
			o.updateSelf(this.latestEpisode);
		}
	}
	

}
