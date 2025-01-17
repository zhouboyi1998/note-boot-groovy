FROM amazoncorretto:17.0.13
LABEL maintainer="zhouboyi<1144188685@qq.com>"

WORKDIR /kotlin/note-boot-groovy
COPY ./target/note-boot-groovy-0.0.1-SNAPSHOT.jar /kotlin/note-boot-groovy/note-boot-groovy-0.0.1-SNAPSHOT.jar

EXPOSE 18095
ENTRYPOINT ["java", "-jar", "note-boot-groovy-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]
