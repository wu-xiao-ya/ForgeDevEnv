## TemplateDevEnv
_For Kotlin see [TemplateDevEnvKt](https://github.com/CleanroomMC/TemplateDevEnvKt)_

Template workspace for modding Minecraft 1.12.2. Licensed under MIT, it is made for public use.

This template runs on **Java 25**, **Gradle 9.2.1** + **[RetroFuturaGradle](https://github.com/GTNewHorizons/RetroFuturaGradle) 2.0.2** + **Forge 14.23.5.2847**.

With **coremod and mixin support** that is easy to configure.

### Instructions:

1. Click `use this template` at the top.
2. Clone the repository that you have created with this template to your local machine.
3. Make sure IDEA is using Java 25 for Gradle before you sync the project. Verify this by going to IDEA's `Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM`.
4. Open the project folder in IDEA. When prompted, click "Load Gradle Project" as it detects the `build.gradle`, if you weren't prompted, right-click the project's `build.gradle` in IDEA, select `Link Gradle Project`, after completion, hit `Refresh All` in the gradle tab on the right.
5. Run gradle tasks such as `runClient` and `runServer` in the IDEA gradle tab, or use the auto-imported run configurations like `1. Run Client`.

### Notes:
- Dependencies script in [gradle/scripts/dependencies.gradle](gradle/scripts/dependencies.gradle), explanations are commented in the file.
- Publishing script in [gradle/scripts/publishing.gradle](gradle/scripts/publishing.gradle).
- When writing Mixins on IntelliJ, it is advisable to use latest [MinecraftDev Fork for RetroFuturaGradle](https://github.com/eigenraven/MinecraftDev/releases).
简体中文：
## TemplateDevEnv
_关于 Kotlin，请参阅[TemplateDevEnvKt](https://github.com/CleanroomMC/TemplateDevEnvKt)_

用于 Minecraft 1.12.2 模组制作的模板工作区。根据 MIT 许可证授权，供公众使用。

此模板运行于 **Java 25**、**Gradle 9.2.1** + **[RetroFuturaGradle](https://github.com/GTNewHorizo​​ns/RetroFuturaGradle) 2.0.2** + **Forge 14.23.5.2847**。

**支持 coremod 和 mixin**，配置简单。

＃＃＃ 指示：

1. 点击顶部的“使用此模板”。
2. 将此模板创建的存储库克隆到本地计算机。
3. 在同步项目之前，请确保 IDEA 使用的是 Java 25 for Gradle。您可以通过转到 IDEA 的“设置 > 构建、执行、部署 > 构建工具 > Gradle > Gradle JVM”来验证这一点。
4. 在 IDEA 中打开项目文件夹。出现提示时，单击“加载 Gradle 项目”，因为它会检测到 `build.gradle` 文件；如果没有出现提示，请在 IDEA 中右键单击项目的 `build.gradle` 文件，选择“链接 Gradle 项目”，完成后，在右侧的 Gradle 选项卡中单击“全部刷新”。
5. 在 IDEA 的 gradle 选项卡中运行 `runClient` 和 `runServer` 等 gradle 任务，或者使用自动导入的运行配置，如 `1. 运行客户端`。

### 备注：
- 依赖项脚本位于 [gradle/scripts/dependencies.gradle](gradle/scripts/dependencies.gradle) 中，解释在文件中有注释。
- 发布脚本位于 [gradle/scripts/publishing.gradle](gradle/scripts/publishing.gradle)。
- 在 IntelliJ 上编写 Mixin 时，建议使用最新的 [MinecraftDev Fork for RetroFuturaGradle](https://github.com/eigenraven/MinecraftDev/releases)。
