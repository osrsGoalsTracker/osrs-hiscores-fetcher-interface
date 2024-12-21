package com.osrs_hiscores_fetcher.api;

import lombok.Value;
import lombok.Builder;

/**
 * Configuration options for fetching OSRS player data from hiscores.
 */
@Value
@Builder
public class FetchOptions {
    /**
     * Whether to calculate virtual levels beyond 99 based on XP.
     * Default is false.
     */
    @Builder.Default
    boolean calculateVirtualLevels = false;

    /**
     * Creates default options.
     * @return FetchOptions with default values
     */
    public static FetchOptions defaults() {
        return builder().build();
    }
} 