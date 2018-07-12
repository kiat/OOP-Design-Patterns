package observer;

public interface PublisherBase {
	
	public void subscribe(SubscriberBase o);
	
	public void unsubscribe(SubscriberBase o);
	
	public void notifySubscribers();
	
}
