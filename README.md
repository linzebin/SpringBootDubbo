# SpringBootDubbo
SpringBoot + Dubbox

因为dubbox没有提供mvn远程仓库的下载,所以需要到https://github.com/dangdangdotcom/dubbox 进行下载  
再到下载目录运行`>mvn clean install -Dmaven.test.skip=true`  将依赖安装到本地的maven仓库
项目还要依赖zookeeper,下载并运行  
先运行服务提供者程序 boot-dubbo-sample-server  
再运行服务消费者程序 boot-dubbo-sample-client 的Junit测试程序 
