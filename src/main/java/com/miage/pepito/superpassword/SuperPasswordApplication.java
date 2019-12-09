package com.miage.pepito.superpassword;

import com.miage.pepito.superpassword.interfaces.IPasswordConsole;
import com.miage.pepito.superpassword.interfaces.IPasswordValidator;
import com.miage.pepito.superpassword.interfaces.IUserManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SuperPasswordApplication extends SpringApplication{
	private IPasswordConsole console;
	private IUserManager users;
	private IPasswordValidator passwordValidator;

	public static void main(String[] args) {
		SpringApplication.run(SuperPasswordApplication.class, args);
	}


}
