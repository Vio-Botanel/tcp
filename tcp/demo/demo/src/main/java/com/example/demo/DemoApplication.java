package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.service.MessageServiceIClient;
import com.example.demo.detaway.TcpClientGateway;

@SpringBootApplication
public class DemoApplication {
	
	/*private static TcpClientGateway tcpClientGateway;

    @Autowired
    public DemoApplication(TcpClientGateway tcpClientGateway) {
        DemoApplication.tcpClientGateway = tcpClientGateway;
    }*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.print("zarzavat");
		//System.out.print("");
		//MessageServiceImpl mimpl = new MessageServiceImpl(tcpClientGateway);
		//mimpl.sendMessagewithParameter("asdasdafwartgwb5gydryeysr");
		//System.out.print("zarzavat2");
	}

}
