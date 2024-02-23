package com.marketingapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.marketingapp.repository.LeadRepository;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendSimpleMailMessage(String to, String sub, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(sub);
		message.setText(body);
		javaMailSender.send(message);

	}

}
