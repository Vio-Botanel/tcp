package com.example.demo.service;

import org.springframework.context.annotation.Bean;

public interface IMessageServiceClient {
	void sendMessage(final String msg);
}
