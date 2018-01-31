package com.spotifymemories.Utilities;

import com.wrapper.spotify.Api;

import java.util.Arrays;
import java.util.List;

import static com.spotifymemories.Utilities.StringConstants.CLIENT_ID;
import static com.spotifymemories.Utilities.StringConstants.CLIENT_SECRET;
import static com.spotifymemories.Utilities.StringConstants.REDIRECT_URI;


/**
 * Utility class to authorize Spotify user.
 * @author Tim Chartier
 */
public final class Authorization {

    /**
     * Utility classes should never be instantiated.
     */
    private Authorization() {

    }

    /**
     * Authorize user.
     */
    public static void authorize() {
        Api api = new Api.Builder()
                .clientId(CLIENT_ID)
                .clientSecret(CLIENT_SECRET)
                .redirectURI(REDIRECT_URI)
                .build();

        final List<String> scopes = Arrays
                .asList("user-read-private", "user-read-email");
        final String state = "testState";
        String authorizeURL = api.createAuthorizeURL(scopes, state);
        System.out.println(authorizeURL);
    }
}
