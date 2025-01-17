<h1 align="center">📔 note-boot-groovy</h1>

<p align="center">
<a target="_blank" href="https://github.com/zhouboyi1998/note-boot-groovy"> 
<img src="https://img.shields.io/github/stars/zhouboyi1998/note-boot-groovy?logo=github">
</a>
<a target="_blank" href="https://opensource.org/licenses/MIT"> 
<img src="https://img.shields.io/badge/license-MIT-red"> 
</a>
<img src="https://img.shields.io/badge/JDK-17-darkcyan"> 
<img src="https://img.shields.io/badge/Groovy-4.0.24-brightgreen"> 
<img src="https://img.shields.io/badge/Spring Boot-3.4.1-brightgreen">
<img src="https://img.shields.io/badge/Spring Data-3.4.1-brightgreen">
</p>

### 📖 语言

简体中文 | [English](./README.en.md)

### 🐳 Docker

* 项目根目录下运行以下命令

#### Maven 打包

```
mvn clean package -DskipTests
```

#### 拉取 Docker 基础镜像

```
docker pull amazoncorretto:17.0.13
```

#### Docker 构建

```
docker build -t note-boot-groovy .
```

#### Docker 运行

```
docker run -d -p 18095:18095 --name note-boot-groovy note-boot-groovy
```

### 📜 开源协议

[MIT License](https://opensource.org/licenses/MIT) Copyright (c) 2022 周博义
