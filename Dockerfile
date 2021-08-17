FROM amazoncorretto:11.0.8-alpine

RUN  mkdir -p /opt/titan && \
    apk update && apk add jq curl bash
RUN apk add --update-cache bash libc6-compat && \
    rm -rf /var/cache/apk/*
RUN apk -Uuv add groff less python3 py-pip 

ADD target\swagger-demo-0.0.1-SNAPSHOT.jar /opt/titan/APPLICATION.jar
RUN ls /opt/titan
EXPOSE 8081
ADD start.bat /opt/titan/startjava 
RUN chmod 777 /opt/titan/startjava && chmod 777 /opt/titan/APPLICATION.jar
CMD ["/bin/bash","/opt/titan/startjava"]

