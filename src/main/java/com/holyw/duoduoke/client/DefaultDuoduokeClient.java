package com.holyw.duoduoke.client;

import com.pdd.pop.sdk.http.HttpClientConfig;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;

/**
 * DenchyChiang
 */
public class DefaultDuoduokeClient implements IClient {


    @Override
    public PopClient getDefaultClient() {//自定义实现，可配置自定义实现类，从数据库、redis、配置中心等获取clientId clientSecret
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        httpClientConfig.setConnectionTimeoutMillis(300);
        httpClientConfig.setConnectionRequestTimeout(300);
        return new PopHttpClient("1", "1", httpClientConfig);//TODO 这里改成自己应用的clientId clientSecret
    }
}
