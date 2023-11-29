package br.dev.ferreiras.aop.entities;

import java.util.Objects;

public class Account {

	private String name;
	private String level;
	public Account(String name, String level) {
		super();
		this.name = name;
		this.level = level;
	}
	public Account() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
