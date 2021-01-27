package com.holyw.duoduoke.client;

import com.holyw.duoduoke.config.DuoduokePropeties;
import com.pdd.pop.sdk.http.HttpClientConfig;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;

/**
 * DenchyChiang
 */
public interface IDuoduokeClient extends IClient {

    @Override
    PopClient getDefaultClient();
}
