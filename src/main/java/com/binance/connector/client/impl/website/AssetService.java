package com.binance.connector.client.impl.website;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.RequestHandler;

import java.util.Map;

/**
 * <h2>Asset Service Endpoints</h2>
 * All endpoints under the
 * <a href="https://www.binance.com">Binance Asset Service</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class AssetService {
    private final String baseUrl;
    private final RequestHandler requestHandler;

    private final boolean showLimitUsage;

    public AssetService(String baseUrl, boolean showLimitUsage) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(null, null, null);
        this.showLimitUsage = showLimitUsage;
    }

    private final String PRODUCT_BY_SYMBOL = "/bapi/asset/v2/public/asset-service/product/get-product-by-symbol";

    /**
     * GET /bapi/asset/v2/public/asset-service/product/get-product-by-symbol
     * <br>
     * @param parameters Map of String,Object pair
     *                   where String is the name of the parameter and Object is the value of the parameter
     *                   <br><br>
     *                   symbol -- required/string <br>
     * @return String
     * @see <a href="https://www.binance.com/bapi/asset/v2/public/asset-service/product/get-product-by-symbol">
     *     https://www.binance.com/bapi/asset/v2/public/asset-service/product/get-product-by-symbol</a>
     */
    public String getProductBySymbol(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendPublicRequest(baseUrl, PRODUCT_BY_SYMBOL, parameters, HttpMethod.GET, false);
    }
}
