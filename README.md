# Tweet Publisher

this component is responsible for getting messages from Kafka and post tweets in our "Corporate" Account.

## Requirements

In order to use this app you need access to a Twitter developer account. For more information on how to get one, see: https://developer.twitter.com/en/apply-for-access


## How to Run Locally
    mvn clean compile quarkus:dev

## How to Deploy in OpenShift
    mvn clean package  -Dquarkus.kubernetes.deploy=true -Dquarkus.kubernetes-client.trust-certs=true -Dquarkus.openshift.expose=true
