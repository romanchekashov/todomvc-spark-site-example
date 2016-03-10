# TodoMVC Spark site example
TodoMVC standalone jar build with Docker. Uses **[frontend-maven-plugin](https://github.com/eirslett/frontend-maven-plugin)** to separate frontend and backend development completely.

Frontend TodoMVC code copied from [React TodoMVC Example](https://github.com/tastejs/todomvc/tree/gh-pages/examples/react).

## There are two types of building: standalone(jar) and webapp(war)
 First **Maven profile "standalone"** builds a **jar** file which can be run with this command:
 
 ```
 mvn -Pstandalone clean package
 ```
 ```
 java -jar target/todomvc-jar-with-dependencies.jar
 ```
 
 or can be build with **Docker** like in this tutorial [getting-started-with-spark-and-docker](https://sparktutorials.github.io/2015/04/14/getting-started-with-spark-and-docker.html)
 with this commands:
 
 ```
  docker build -t romanchekashov/todomvc .
 ```
 ```
  docker run -d --name todomvc -p 4567:4567 romanchekashov/todomvc
 ```
 
 
 Second **Maven profile "webapp"** builds a **war** file which can be deployed on [Jetty](http://www.eclipse.org/jetty/) with this command:
  
 ```
 mvn -Pwebapp clean package
 ```
 
 which creates target/todomvc.war
    
## Technology stack

**Backend**
[Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
[Spark](http://sparkjava.com/) - A micro framework for creating web applications in Java 8 with minimal effort.
[Jetty](http://www.eclipse.org/jetty/) provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. These components are open source and available for commercial use and distribution.
[Maven 3](https://maven.apache.org/) is a software project management and comprehension tool.
[Docker](https://www.docker.com/) An open platform for distributed applications for developers and sysadmins.

**Frontend**
[frontend-maven-plugin](https://github.com/eirslett/frontend-maven-plugin) A Maven plugin that downloads/installs Node and NPM locally, runs NPM install, Grunt, Gulp and/or Karma.
[Node.js](https://nodejs.org/).
[Grunt](http://gruntjs.com/) The JavaScript Task Runner.
[React](https://facebook.github.io/react/) A JavaScript library for building user interfaces.

*Keep hacking and remember Perf Matter*