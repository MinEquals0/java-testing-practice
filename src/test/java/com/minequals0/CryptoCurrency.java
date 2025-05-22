package com.minequals0;

import java.util.HashMap;
import java.util.Map;


// 테스트를 위한 클래스
public class CryptoCurrency {
    private String currencyName;
    private String currencyUnit;
    public static Map<String, String> map = new HashMap<>();

    static {
        map.put("BTC", "Bitcoin");
        map.put("ETH", "Ethereum");
        map.put("ADA", "ADA");
        map.put("POT", "Polkadot");
    }
}
