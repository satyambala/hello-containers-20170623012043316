package com.nglinx.pulse.tcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nglinx.pulse.tcp.netty.TCPServer;

/**
 * Spring Java Configuration and Bootstrap
 *
 * @author bala
 */
@SpringBootApplication
public class TcpPulseEngine {

    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext context = SpringApplication.run(TcpPulseEngine.class, args);
        TCPServer tcpServer = context.getBean(TCPServer.class);
        tcpServer.start();
    }

}