FROM amazoncorretto:17-alpine-jdk
MAINTAINER Rahul-Aws
ADD target/leetcode-0.0.1-SNAPSHOT.jar leetcode-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "/leetcode-0.0.1-SANPSHOT.jar"]