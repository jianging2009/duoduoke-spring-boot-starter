package com.holyw.duoduoke.template;

import com.holyw.duoduoke.support.DuoduokeSupportRepository;
import com.holyw.duoduoke.vo.GoodsVO;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddDdkGoodsDetailRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddDdkOrderListIncrementGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOrderListIncrementGetResponse;


public class DuoduokeOrderTemplate {

    private DuoduokeSupportRepository duoduokeSupportRepository;


    public DuoduokeOrderTemplate(DuoduokeSupportRepository duoduokeSupportRepository) {
        this.duoduokeSupportRepository = duoduokeSupportRepository;
    }

    public PddDdkOrderListIncrementGetResponse OrderListIncrementGet(PddDdkOrderListIncrementGetRequest request) throws Exception{
        PddDdkOrderListIncrementGetResponse pddDdkOrderListIncrementGetResponse = duoduokeSupportRepository.pddDdkOrderListIncrementGet(request);
        return pddDdkOrderListIncrementGetResponse;
    }
}
