package com.osrs;

import com.osrs.models.OsrsPlayer;
import java.io.IOException;

/**
 * Interface for fetching Old School RuneScape player data.
 */
public interface OsrsPlayerFetcher {
    /**
     * Fetches player data for the given RuneScape name (RSN).
     *
     * @param rsn The RuneScape name of the player to fetch data for
     * @return OsrsPlayer object containing the player's skills and activities
     * @throws IOException if there is an error fetching the player data
     * @throws IllegalArgumentException if the RSN is invalid or player not found
     */
    OsrsPlayer getPlayerByRsn(String rsn) throws IOException, IllegalArgumentException;
} 