# ATOPizzaFactory.ToolKit.Java

A modular Java library developed for playground, learning and demo purposes.


## Build Tool (Gradle)

### Specs

Vendor (Embedded): **Gradle** / Version : **Gradle 8.7**

```bash
./gradlew -v
```

```console
$ ./gradlew -v
------------------------------------------------------------
Gradle 8.7
...
```

## Running Tests

To execute the unit tests run:

```bash
./gradlew test
```

If the dependencies were previously downloaded you can run offline:

```bash
./gradlew test --offline
```

## Publishing Artifacts

Publishing is disabled by default. To publish to the configured Maven
repository you must explicitly allow it:

```bash
./gradlew publish -PallowPublish=true
```
