package br.dev.ferreiras.aop.dao;

import org.springframework.stereotype.Repository;

import br.dev.ferreiras.aop.entities.Account;

@Repository
public class MembershipDAOImp implements MembershipDAO{

	@Override
	public void addAccount(Account account) {
		System.out.println(getClass() + ": DOING DB Membership STUFF");
		
	}

}
