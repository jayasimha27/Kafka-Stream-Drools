# Kafka-Stream-Drools
A demo combining Kafka Streams and Drools to create a lightweight real-time rules engine.

# Kafka Streams
A lightweight API (< 9000 lines of code) within Kafka allows data to be processed in real-time in the Kafka brokers themselves - 
no additional services need to be installed on the cluster, and no additional management or coordinator job is required. 
A full overview of Kafka Streams can be found on website https://kafka.apache.org/documentation/streams/. 

# The Application
This POC application uses a Kafka Streams pipeline to read data from a Kafka topic, apply a simple rule (if the input String contains an e 
it prepends the message with 0), and write it to an output topic. 

The application itself can be run by following the

1. Create the topics inputTopic and outputTopic (or change config.properties within the project before building it).
2. Build the kafka-streams-drools project with mvn clean install, move the resulting fat JAR onto a node within the cluster, and then run it with java -cp kafka-streams-drools-0.0.1-SNAPSHOT-jar-with-dependencies.jar uk.co.hadoopathome.kafkastreams.KafkaStreamsDroolsMain. Do this step instead of executing the ./bin/kafka-run-class command.

If a Kafka environment is already present, only follow step 2.
