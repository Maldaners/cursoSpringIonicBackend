package com.sabrina.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.sabrina.cursomc.domain.Cliente;
import com.sabrina.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
