package com.spotifymemories;

import com.spotifymemories.Utilities.Authorization;

/**
 * Runs the package.
 */
public final class Driver {

    /**
     * Utility class.
     */
    private Driver() {

    }

    /**
     * Run package.
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        Authorization.authorize();
    }

}

