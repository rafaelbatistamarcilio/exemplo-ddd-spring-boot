package com.app.exemploddd.transporte.infrastructure.config;

import com.app.exemploddd.transporte.application.AlocarPedido;
import com.app.exemploddd.transporte.application.ObterAlocacao;
import com.app.exemploddd.transporte.domain.ports.output.IAlocacaoRepository;
import com.app.exemploddd.transporte.infrastructure.adapters.db.repository.AlocacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
public class BeansConfig {
    
    @Autowired
    private AlocacaoRepository alocacaoRepository;

    @Bean
    public IAlocacaoRepository getAlocacaoRepository() {
        return alocacaoRepository;
    }

    @Bean
    public ObterAlocacao getObterAlocacao() {
        return new ObterAlocacao(this.alocacaoRepository);
    }

    @Bean
    public AlocarPedido getAlocarPedido() {
        return new AlocarPedido(this.alocacaoRepository);
    }

    @Bean(name = "applicationEventMulticaster")
    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
        SimpleApplicationEventMulticaster eventMulticaster =
          new SimpleApplicationEventMulticaster();
        
        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
        return eventMulticaster;
    }
}
