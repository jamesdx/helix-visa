# 分布式事务
## 背景
在分布式系统架构中，一个业务通常会由多个服务来完成，


间通过发送消息来实现异步通讯，因此，分布式事务是我们必然面对的挑战。业界通常有`本地表`和 MQ Server提供事务功能来解决这个问题，也就是通常我们所说的分布式事务
RocketMQ的事务消息支持在业务逻辑与发送消息之间提供事务保证，RocketMQ通过两阶段的方式提供事务消息的支持