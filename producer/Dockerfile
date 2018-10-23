FROM ubuntu:latest
FROM openjdk:8-jdk

COPY . /spring-cloud-contract-sample/producer/

WORKDIR /spring-cloud-contract-sample/producer/

RUN gradle clean build

CMD ["./build.sh"]
