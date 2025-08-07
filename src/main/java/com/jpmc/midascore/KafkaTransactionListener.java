package com.jpmc.midascore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.jpmc.midascore.foundation.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaTransactionListener {
    private static final Logger logger = LoggerFactory.getLogger(KafkaTransactionListener.class);

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core")
    public void listen(Transaction transaction) {
        logger.info("Received transaction: {}", transaction);
    }
}
