# Spring karate demo

This library offers a huge amount of tools to simplify our tests.

It can be used throug cucumber and you will notice that you can save tons of "glue" code.

A simple example.
We have a controller in "/api/greeting" that gives us this response:

![](https://github.com/delalama/SpringKarateDemo/blob/master/docu/api.png)

With only this feature we can do a basic test

![](https://github.com/delalama/SpringKarateDemo/blob/master/docu/feature.png)

# Controller with body

Here we can test a post controller with parameter

In this case we check that the parameterized greeting is literally as expected.
![](https://github.com/delalama/SpringKarateDemo/blob/master/docu/post.png)

![](https://github.com/delalama/SpringKarateDemo/blob/master/docu/feature2.png)


Karate also offers the possibility to visualize your executions , it looks like this:

LINK [KARATE RESULTS](https://github.com/delalama/SpringKarateDemo/blob/master/docu/karateResults.png)

you only need to add this to the pom:

```java
		<dependency>
			<groupId>net.masterthought</groupId>
			<artifactId>cucumber-reporting</artifactId>
			<version>3.8.0</version>
			<scope>test</scope>
		</dependency>
```
The result will be by default in your "target/surefire-reports" folder.


It will be continued to cover further functionalities
