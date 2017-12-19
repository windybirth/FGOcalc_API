#!/bin/sh

git pull
gradle build

echo stop application
source stop.sh

echo start application
source start.sh
