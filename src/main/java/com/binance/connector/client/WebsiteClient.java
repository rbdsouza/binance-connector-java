package com.binance.connector.client;

import com.binance.connector.client.impl.website.AssetService;

public interface WebsiteClient {
    /**
     * Gets the base URL for the website client.
     *
     * @return the base URL as a String
     */
    String getBaseUrl();

    /**
     * Checks if the limit usage information should be displayed.
     *
     * @return true if limit usage should be displayed, false otherwise
     */
    boolean isShowLimitUsage();

    /**
     * Sets whether to show limit usage information.
     *
     * @param showLimitUsage true to show limit usage, false otherwise
     */
    void setShowLimitUsage(boolean showLimitUsage);

    AssetService createAssetService();
}
