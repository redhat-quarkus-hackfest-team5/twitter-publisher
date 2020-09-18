 # Deploy in OpenShift
 mvn clean package  -Dquarkus.kubernetes.deploy=true -Dquarkus.kubernetes-client.trust-certs=true -Dquarkus.openshift.expose=true