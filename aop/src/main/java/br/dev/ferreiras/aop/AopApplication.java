package br.dev.ferreiras.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.dev.ferreiras.aop.dao.AccountDAO;
import br.dev.ferreiras.aop.dao.MembershipDAO;
import br.dev.ferreiras.aop.entities.Account;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner (AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {
		
		return runner -> {
			
			demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
		};
		
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO,MembershipDAO theMemberShipDAO) {
		
		Account account = new Account();
		theAccountDAO.addAccount(account);
		System.out.println("\n\nDo it again!!!");
		theAccountDAO.addAccount(account);
		System.out.println("\n\nDo it again!!!");

		theMemberShipDAO.addAccount(account);
		
		
		
	}

}
