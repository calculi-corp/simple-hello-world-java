echo "Integration Test START"
java -jar ${PKG_BASE_DIR}/${APPLICATION_NAME}/HelloWorld-0.0.1-SNAPSHOT.jar
curl http://localhost:8082/HelloWorldExample/hello
