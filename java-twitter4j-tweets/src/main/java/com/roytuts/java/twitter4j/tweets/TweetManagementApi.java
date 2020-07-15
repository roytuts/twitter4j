package com.roytuts.java.twitter4j.tweets;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TweetManagementApi {

	public static void main(String[] args) throws TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();

		// Timelines
		List<Status> statuses = twitter.getHomeTimeline();

		System.out.println("Showing home timeline.");
		for (Status status : statuses) {
			System.out.println(status.getUser().getName() + ":" + status.getText());
		}

		// Post a tweet
		Status status = twitter.updateStatus("Test");
		System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}

}
