
#nacos demo

1.[下载最新版nacos客户端](https://github.com/alibaba/nacos/releases)，并启动nacos(本工程使用的是1.0.0版本)<br/>
2.下载代码 <code>git clone https://github.com/ez1215/mynacos.git</code><br/>
依次执行：<br/>
```
    cd mynacos
    mvn install
    cd myprovider/target
    java -jar myprovider-0.0.1-SNAPSHOT.jar
    cd myconsumer/target
    java -jar myconsumer-0.0.1-SNAPSHOT.jar
```
3.访问提供者:`http://127.0.0.1:8844/hello?name=tony`  会返回 `hello ,tony`<br/>
4.通过 feign 访问:`http://127.0.0.1:8845/feign?name=tony`  会返回 `hello ,tony`