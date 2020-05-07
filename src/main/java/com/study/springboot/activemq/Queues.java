package com.study.springboot.activemq;

public interface Queues {

    String QUEUE_REDELIVERY_EVERY_10_SECONDS = "QUEUE_10_SECONDS";
    String QUEUE_REDELIVERY_EVERY_MINUTE = "QUEUE_EVERY_MINUTE";

    String QUEUE_REDELIVERY_EVERY_10_SECONDS_ACK = "QUEUE_10_SECONDS_ACK";

    String QUEUE_NORMAL = "QUEUE_NORMAL";

    String QUEUE_TRANSACTIONAL = "QUEUE_TRANSACTIONAL";

    String QUEUE_TRANSACTIONAL_NO_REDELIVERY = "QUEUE_TRANSACTIONAL_NO_REDELIVERY";
}