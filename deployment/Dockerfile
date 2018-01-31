FROM docker-registry.rewe-digital.com/rewe-java

MAINTAINER Shangri Llama (dev-team-shangrillama@rewe-digital.com)

ADD build/libs/ /opt/rewe/

ENV JAR_FILE /opt/rewe/zipkin-poc.jar
ENV JAVA_MEMORY_OPTS -Xms1024m -Xmx1024m -XX:+UseG1GC