minimal project to cause SCL-20457

Open Main.scala.
Start typing.
Intellij freezes.
CPU at 800-1000%.

Breaks on:

IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022

Runtime version: 17.0.4.1+7-b469.62 aarch64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
macOS 13.0
GC: G1 Young Generation, G1 Old Generation
Memory: 14336M
Cores: 10
Metal Rendering is ON
Registry:
    typescript.service.node.arguments=--max_old_space_size=4096
    scala.erase.compiler.process.jdk.once=false

Non-Bundled Plugins:
    org.jetbrains.plugins.hocon (2022.1.0)
    org.jetbrains.kotlin (222-1.7.20-release-201-IJ4167.29)
    PlantUML integration (5.19)
    intellij.prettierJS (222.4345.14)
    com.dmarcotte.handlebars (222.4345.14)
    org.intellij.scala (2022.2.683)

Kotlin: 222-1.7.20-release-201-IJ4167.29