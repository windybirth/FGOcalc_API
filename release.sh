#!/bin/sh
git pull
gradle build
sudo nohup java -jar build/libs/fgocalc-rest-service-0.1.0.jar >logs/SpringRuntimeLog.txt & 