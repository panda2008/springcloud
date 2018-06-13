# springcloud

register-center:注册中心，所有服务都注册到这里------》http://localhost:8100/eureka/
service-ribbon：作为负载均衡，向服务注册中心注册,端口为8110。
service-hi和service-hello是两个不同的服务提供者,向服务注册中心注册，端口分别为8101，8102。

Eureka地址： http://localhost:8100

测试地址：http://localhost:8110/test/testHello?name=panda
         http://localhost:8110/test/testHi?name=panda
