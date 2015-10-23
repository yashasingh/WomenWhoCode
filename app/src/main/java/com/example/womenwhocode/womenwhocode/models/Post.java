package com.example.womenwhocode.womenwhocode.models;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by zassmin on 10/16/15.
 */
@ParseClassName("Post")
public class Post extends ParseObject {
    public static String DESCRIPTION_KEY = "description";
    public static String IMAGE_URL_KEY = "image_url";
    public static String NETWORK_KEY = "network";
    public static String EVENT_KEY = "event";
    public static String FEATURE_KEY = "feature";
    public static String AWESOME_COUNT_KEY = "awesome_count";
    public static String USER_KEY = "user";

    public void setDescription(String description) {
        put(DESCRIPTION_KEY, description);
    }

    public String getDescription() {
        return this.get(DESCRIPTION_KEY).toString();
    }

    public void setNetwork(Network network) {
        put(NETWORK_KEY, network);
    }

    public Network getNetwork() {
        return (Network) getParseObject(NETWORK_KEY);
    }

    public void setEvent(Event event) {
        put(EVENT_KEY, event);
    }

    public Event getEvent() {
        return (Event) getParseObject(EVENT_KEY);
    }

    public void setFeature(Feature feature) {
        put(FEATURE_KEY, feature);
    }

    public Feature getFeature() {
        return (Feature) getParseObject(FEATURE_KEY);
    }

    public void setImageUrl(String imageUrl) {
        put(IMAGE_URL_KEY, imageUrl);
    }

    public String getImageUrl() {
        return this.get(IMAGE_URL_KEY).toString();
    }

    public void setUser(ParseUser user) {
        put(USER_KEY, user);
    }

    public ParseUser getUser()  {
        return (ParseUser) getParseObject(USER_KEY);
    }

    // awesomeCount is for our stretch goals
    public void setAwesomeCount(int awesomeCount) {
        put(AWESOME_COUNT_KEY, awesomeCount);
    }

    public int getAwesomeCount() {
        return this.getInt(AWESOME_COUNT_KEY);
    }
}