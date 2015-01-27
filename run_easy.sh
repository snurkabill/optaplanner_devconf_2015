cd ./cloudbalance_easymodel

mvn clean install "-Dexec.args=-classpath %classpath org.optaplanner.examples.cloudbalancing.app.CloudBalancingApp" org.codehaus.mojo:exec-maven-plugin:1.2.1:exec -s ../settings.xml

