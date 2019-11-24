package com.poc.kafkastreams;

import org.apache.commons.configuration2.PropertiesConfiguration;
import com.poc.kafkastreams.configuration.ConfigurationReader;

public class KafkaStreamsDroolsMain {

    public static void main(String[] args) {
        PropertiesConfiguration properties = ConfigurationReader.getProperties("config.properties");
        KafkaStreamsRunner.runKafkaStream(properties);
    }
}
