#!/bin/sh
#!/usr/bin/expect
set timeout 30

git pull
gradle build
spawn sudo nohup java -jar build/libs/fgocalc-rest-service-0.1.0.jar >logs/SpringRuntimeLog.txt & 
expect "password for"
send "password\r"
interact