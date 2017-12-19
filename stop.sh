PID=$(ps -ef | grep fgocalc-rest-service-0.1.0.jar | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
    echo Application is already stopped
else
    echo kill $PID
    sudo kill $PID
fi