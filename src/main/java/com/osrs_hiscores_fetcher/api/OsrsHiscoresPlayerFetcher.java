package com.osrs_hiscores_fetcher.api;

import com.osrs_hiscores_fetcher.api.models.OsrsPlayer;
import java.io.IOException;

/**
 * Interface for fetching Old School RuneScape player data from the hiscores.
 */
public interface OsrsHiscoresPlayerFetcher {
    /**
     * Fetches player data from the hiscores for the given RuneScape name (RSN).
     * Uses default options.
     *
     * @param rsn The RuneScape name of the player to fetch data for
     * @return OsrsPlayer object containing the player's skills and activities
     * @throws IOException if there is an error fetching the player data
     * @throws IllegalArgumentException if the RSN is invalid or player not found
     */
    default OsrsPlayer getPlayerByRsn(String rsn) throws IOException, IllegalArgumentException {
        return getPlayerByRsn(rsn, FetchOptions.defaults());
    }

    /**
     * Fetches player data from the hiscores for the given RuneScape name (RSN) with specified options.
     *
     * @param rsn The RuneScape name of the player to fetch data for
     * @param options Configuration options for the fetch operation
     * @return OsrsPlayer object containing the player's skills and activities
     * @throws IOException if there is an error fetching the player data
     * @throws IllegalArgumentException if the RSN is invalid or player not found
     */
    OsrsPlayer getPlayerByRsn(String rsn, FetchOptions options) throws IOException, IllegalArgumentException;
} 