# CS427 Software Engineering Coursework

A CS427 coursework snapshot built on the upstream jsoup Java HTML parser. jsoup is an existing open-source library. This repository preserves attribution and collects course build/testing work and separate MP code by Xiaoxi Chen.

Jsoup is a Java library, not a web application. The source includes examples under src/main/java/org/jsoup/examples. Main library code and tests retain the original src layout. The Maven test configuration has been adjusted to omit a machine-specific patched java.util.HashMap requirement. The original POM is preserved in coursework/original-jsoup-pom.xml.

## Other coursework

coursework/ contains the separately supplied MP2 code generation/parsing/modification files, extra-credit experiments, and MP4 bonus files. These are not compiled as part of the root jsoup library and may need their original assignment dependencies or commands.
