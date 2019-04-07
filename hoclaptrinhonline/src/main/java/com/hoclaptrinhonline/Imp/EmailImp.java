package com.hoclaptrinhonline.Imp;

import org.springframework.mail.SimpleMailMessage;

public interface EmailImp {
	public void sendEmail(SimpleMailMessage email);

}
