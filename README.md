# jsoup Software Engineering Coursework

A CS427 coursework snapshot built on the upstream jsoup Java HTML parser. jsoup is an existing open-source library; this repository preserves its license and attribution and collects course build/testing work and separate MP code by Xiaoxi Chen.

## Build and test

Install JDK 17 and Maven, then run from this repository root:

```sh
mvn test
mvn package -DskipTests
```

This is a Java library, not a web application. The source includes examples under src/main/java/org/jsoup/examples. Main library code and tests retain the original src layout. The Maven test configuration has been adjusted to omit a machine-specific patched java.util.HashMap requirement; the original POM is preserved in coursework/original-jsoup-pom.xml.

## Other coursework

coursework/ contains the separately supplied MP2 code generation/parsing/modification files, extra-credit experiments, and MP4 bonus files. These are not compiled as part of the root jsoup library and may need their original assignment dependencies or commands.

## Attribution and scope

See LICENSE and the preserved upstream README in docs/upstream-README.md. The bulk of the parser is upstream jsoup code, not an independently authored library. Course-specific tests and build changes are archived alongside it. Keep assignment solutions private unless course sharing is permitted.

Generated build output, downloaded logs, Git history, notes, evaluation documents, and duplicate ZIP files are excluded. See PACKAGING_NOTES.txt for unavailable files and build verification.

## Local parsing demo

After building the JAR, run from the project root (macOS/Linux):

```sh
mkdir -p demo-out
javac -cp target/jsoup-1.12.2-SNAPSHOT.jar -d demo-out examples/ParseHtmlDemo.java
java -cp target/jsoup-1.12.2-SNAPSHOT.jar:demo-out ParseHtmlDemo
```

## Verification

On JDK 17, Maven compilation and JAR packaging passed. The local parsing demo passed. The original test suite ran 839 tests: 837 passed and 2 failed (HttpConnectionTest.headers and multipleHeaders). Both failures compare expected HTTP headers against requests that also contain default User-Agent and Accept-Encoding headers. Original tests were preserved rather than altered to hide these failures. Gradle, Ant, bonus code, and mutation-testing tasks were not verified.
