package com.viha.nilesh.util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@Service
public class EmailUtility {

	@Autowired
	private JavaMailSender jMailSender;

	private static final Integer EXPIRE_MINS = 5;
	private LoadingCache<String, Integer> otpCache;

	public EmailUtility() {
		super();
		otpCache = CacheBuilder.newBuilder().expireAfterWrite(EXPIRE_MINS, TimeUnit.MINUTES)
				.build(new CacheLoader<String, Integer>() {
					public Integer load(String key) {
						return 0;
					}
				});
	}

	public boolean sendEmail(String subject, String to, String body) throws Exception {
		MimeMessage msg = jMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(body, true);
		jMailSender.send(msg);
		return true;
	}

	public int generateOTP() {
		Random random = new Random();
		int otp = 100000 + random.nextInt(900000);
		otpCache.put("otp", otp);
		return otp;
	}

	public int getOtp() {
		try {
			return otpCache.get("otp");
		} catch (Exception e) {
			return 0;
		}
	}

	public void clearOTP() {
		otpCache.invalidate("otp");
	}

}
