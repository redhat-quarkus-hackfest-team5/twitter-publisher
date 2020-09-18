# Tweet Publisher

this component is responsible for getting messages from Kafka and post tweets in our "Corporate" Account.

 ## How to Deploy in OpenShift
    mvn clean package  -Dquarkus.kubernetes.deploy=true -Dquarkus.kubernetes-client.trust-certs=true -Dquarkus.openshift.expose=true
