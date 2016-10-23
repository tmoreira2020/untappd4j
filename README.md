Untappd4j
==========
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/br.com.thiagomoreira.untappd/untappd4j/badge.svg)](https://maven-badges.herokuapp.com/maven-central/br.com.thiagomoreira.untappd/untappd4j)

Untappd4j is a Java/REST client to access the Untappd API available at [Untappd's Developer Documentation](https://untappd.com/api/docs). It was developed based on [Retrofit2](http://square.github.io/retrofit/).

### License

Untappd4j is licensed under [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) license.

### Getting Started

It's really simple to use the client, first of all you need credentials, e.g. client_id and client_secret that must be requested at [Untappd Add App](https://untappd.com/api/register?register=new)

The second step is create a object of `br.com.thiagomoreira.untappd.Untappd` class and  start to invoke its methods. That's it!


```java
import br.com.thiagomoreira.untappd.Untappd;
import br.com.thiagomoreira.untappd.model.Brewery;

public static void main(String[] args) {
    String clientId = "...";
    String clientSecret = "...";

    Untappd untappd = new Untappd(clientId, clientSecret);

    Brewery brewery = untappd.getBrewery(459);

    System.out.println(brewery.getBreweryName());
    System.out.println(brewery.getBeerCount());
}
```

### Which methods are implemented?

Yep, it is a small list. Can you help me? Look here: [Contributing](#contributing).
* getBrewery(long breweryId)
* getBeer(long beerId)

### Maven/Gradle

Untappd4j is available on Maven central, the artifact is as follows:

Maven:

```xml
<dependency>
    <groupId>br.com.thiagomoreira.untappd</groupId>
    <artifactId>untappd4j</artifactId>
    <version>1.0.0</version>
</dependency>
```
Gradle:

```groovy
dependencies {
    compile(group: "br.com.thiagomoreira.untappd", name: "untappd4j", version: "1.0.0");
}
```
### Support
Untappd4j tracks [bugs and feature requests](https://github.com/tmoreira2020/untappd4j/issues) with Github's issue system. Feel free to open your [new ticket](https://github.com/tmoreira2020/untappd4j/issues/new)!

### Contributing

Untappd4j is a project based on Maven to improve it you just need to fork the repository, clone it and from the command line invoke

```shell
mvn package
```
After complete your work you can send a pull request to incorporate the modifications.

Enjoy!