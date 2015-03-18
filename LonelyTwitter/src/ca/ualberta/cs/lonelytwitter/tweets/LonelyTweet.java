package ca.ualberta.cs.lonelytwitter.tweets;

import java.io.Serializable;

public class LonelyTweet {

	protected String tweetBody;

	public LonelyTweet() {
		super();
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetDate();
	}

	public String getTweetBody() {
		return tweetBody;
	}



}