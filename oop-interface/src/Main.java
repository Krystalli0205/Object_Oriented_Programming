public class Main {

	public static void main(String[] args) {
		// TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { 
				//new Income(3000), 
				new SalaryIncome(7500), 
				new RoyaltyIncome(12000) 
				};
		double total = 0;
		// TODO:
		for (Income income:incomes) {
			total = total + income.getTax();
		}
		System.out.println(total);
	}

}

interface Income{
	double getTax();
}

class SalaryIncome implements Income{
	private double income;
	
	public SalaryIncome(double income) {
		this.income = income;
	}
	
	public double getTax() {
		if (income < 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}
}

class RoyaltyIncome implements Income{
	private double income;
	
	public RoyaltyIncome(double income) {
		this.income = income;
	}
	
	public double getTax() {
		return income * 0.2;
	}
}