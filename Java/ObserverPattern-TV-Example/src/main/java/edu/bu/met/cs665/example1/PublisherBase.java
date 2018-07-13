package edu.bu.met.cs665.example1;

public interface PublisherBase {
	
	public void subscribe(SubscriberBase o);
	
	public void unsubscribe(SubscriberBase o);
	
	public void notifySubscribers();
	
}
