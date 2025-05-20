package com.kafka.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class kafkaTopicConfig {

    @Bean
    public NewTopic kafkaTopic() {
        return TopicBuilder.name("Topic-1")
                .build();
    }
}
