package com.diti.shoppinglist.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.TransportClientFactoryBean

@Configuration
@EnableAutoConfiguration
class EsConfig {
    @Value("\${spring.data.elasticsearch.cluster-nodes}")
    private val clusterNodes: String? = null

    @Value("\${spring.data.elasticsearch.cluster-name}")
    private val clusterName: String? = null

    @Bean
    @ConditionalOnMissingBean
    fun elasticsearchClient(): TransportClientFactoryBean {
        val facoryBean = TransportClientFactoryBean()
        this.clusterName?.let { facoryBean.setClusterName(it) }
        this.clusterNodes?.let { facoryBean.setClusterNodes(it) }
        return facoryBean
    }
}