package com.nglinx.pulse.tcp.netty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "tcp")
@Component
public class TcpServerProperty {
    protected Integer port;
    protected Integer bossThreadCount;
    protected Integer workerThreadCount;
    protected Boolean keepAlive;
    protected Integer backlog;
    public Integer getPort() {
        return port;
    }
    public void setPort(Integer port) {
        this.port = port;
    }
    public Integer getBossThreadCount() {
        return bossThreadCount;
    }
    public void setBossThreadCount(Integer bossThreadCount) {
        this.bossThreadCount = bossThreadCount;
    }
    public Integer getWorkerThreadCount() {
        return workerThreadCount;
    }
    public void setWorkerThreadCount(Integer workerThreadCount) {
        this.workerThreadCount = workerThreadCount;
    }
    public Boolean getKeepAlive() {
        return keepAlive;
    }
    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }
    public Integer getBacklog() {
        return backlog;
    }
    public void setBacklog(Integer backlog) {
        this.backlog = backlog;
    }
    @Override
    public String toString() {
	return "NettyProperty [port=" + port + ", bossThreadCount=" + bossThreadCount + ", workerThreadCount="
		+ workerThreadCount + ", keepAlive=" + keepAlive + ", backlog=" + backlog + "]";
    }
}
