1、准备3台mysql节点
192.168.80.129:3306 master0/master1
192.168.80.130:3306 slave0/slave2
192.168.80.132:3306 slave1/slave3
2、给master0和master1都创建表：c_order0、c_order1
3、配置对应的分片策略
4、执行insert
5、执行select