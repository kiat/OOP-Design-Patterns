package edu.bu.met.cs665.example1;

public class Person implements SubscriberBase {
	
	private String name;
	
	private TvShow show;
	
	private String latestEpisode;
	
	public Person(String name, TvShow show) {
		this.name = name;
		this.show = show;
		this.latestEpisode = "";
		this.show.subscribe(this);
	}
	
	public void updateSelf(String latestEpisode) {
		this.latestEpisode = latestEpisode;
		
		System.out.println("The latest episode that was delivered to " + this.getName() + " is " + getMyLatestEpisode());
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMyLatestEpisode() {
		return this.latestEpisode;
	}
	
}
