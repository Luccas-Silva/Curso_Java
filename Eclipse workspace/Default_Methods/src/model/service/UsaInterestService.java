package model.service;

public class UsaInterestService implements InterestService {
	
	double interestRate;
	
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
