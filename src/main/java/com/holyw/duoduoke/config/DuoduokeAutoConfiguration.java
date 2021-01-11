package com.holyw.duoduoke.config;

import com.holyw.duoduoke.client.DefaultDuoduokeClient;
import com.holyw.duoduoke.core.DuoduokeGoodsTemplate;
import com.holyw.duoduoke.core.DuoduokeOrderTemplate;
import com.holyw.duoduoke.proxy.PddPrimaryProxy;
import com.holyw.duoduoke.support.DuoduokeSupportRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuoduokeAutoConfiguration {
    @Bean
    public DefaultDuoduokeClient duoduokeClient() {
        return new DefaultDuoduokeClient();
    }

    @Bean
    public DuoduokeSupportRepository duoduokeRepository(DefaultDuoduokeClient client) {
        DuoduokeSupportRepository duoduokeSupportRepository = new PddPrimaryProxy(client).getProxy(DuoduokeSupportRepository.class);
        return duoduokeSupportRepository;
    }

    @Bean
    public DuoduokeGoodsTemplate pddGoodsTemplate(DuoduokeSupportRepository duoduokeSupportRepository) {
        return new DuoduokeGoodsTemplate(duoduokeSupportRepository);
    }

    @Bean
    public DuoduokeOrderTemplate pddOrderTemplate(DuoduokeSupportRepository duoduokeSupportRepository) {
        return new DuoduokeOrderTemplate(duoduokeSupportRepository);
    }

}
