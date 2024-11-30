package com.binance.connector.client.impl;

import com.binance.connector.client.WebsiteClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.website.AssetService;

public class WebsiteClientImpl implements WebsiteClient {
    private final String baseUrl;
    private boolean showLimitUsage = false;

    public WebsiteClientImpl() {
        this(DefaultUrls.WEBSITE_URL);
    }

    public WebsiteClientImpl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public WebsiteClientImpl(String baseUrl, boolean showLimitUsage) {
        this(baseUrl);
        this.showLimitUsage = showLimitUsage;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public boolean isShowLimitUsage() {
        return this.showLimitUsage;
    }

    public void setShowLimitUsage(boolean showLimitUsage) {
        this.showLimitUsage = showLimitUsage;
    }

    @Override
    public AssetService createAssetService() {
        return new AssetService(this.baseUrl, this.showLimitUsage);
    }
}

