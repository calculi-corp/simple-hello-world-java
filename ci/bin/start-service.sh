export JAVA_HOME=/var/vcap/packages/jdk/jdk/jdk1.8.0_181
export PATH=$PATH:$JAVA_HOME/bin
java -jar ${PKG_BASE_DIR}/${APPLICATION_NAME}/HelloWorld-0.0.2-SNAPSHOT.jar
echo "Starting application"
while [ $count -ge 0 ]; do
    success=$(curl -s http://localhost:8082/HelloWorldExample/hello)
    if [ $? -eq 0 ]; then
        break
    fi
    sleep 1;
    let count-=1
done
if [ $success == 0 ]; then
    echo "Deployment completed:$scansuccess"
    exit 0
else
    echo "Deployment did not complete in 5 attempts, exiting"
    exit 1
fi
