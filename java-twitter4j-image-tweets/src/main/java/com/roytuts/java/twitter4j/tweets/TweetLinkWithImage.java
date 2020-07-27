package com.roytuts.java.twitter4j.tweets;

import java.io.File;

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.UploadedMedia;

public class TweetLinkWithImage {

	public static void main(String[] args) throws TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();

		// post a tweet link with image
		String statusMessage = "My Picture";
	    File imagefile = new File("soumitra.jpg");

	    long[] mediaIds = new long[1];
	    UploadedMedia media = twitter.uploadMedia(imagefile);
	    mediaIds[0] = media.getMediaId();

	    StatusUpdate statusUpdate = new StatusUpdate(statusMessage);
	    statusUpdate.setMediaIds(mediaIds);
	    
		Status status = twitter.updateStatus(statusUpdate);
		System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}

}
