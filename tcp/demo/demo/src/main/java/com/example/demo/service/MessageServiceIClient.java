package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.detaway.TcpClientGateway;

@Service
public class MessageServiceIClient implements IMessageServiceClient{
	private TcpClientGateway tcpClientGateway;

    @Autowired
    public MessageServiceIClient(TcpClientGateway tcpClientGateway) {
        this.tcpClientGateway = tcpClientGateway;
    }

    @Override
    public void sendMessage(final String msg) {
    	byte[] responseBytes = tcpClientGateway.send(msg.getBytes());
        String response = new String(responseBytes);
        System.out.println("Receive response: " +  response);
    }
}
