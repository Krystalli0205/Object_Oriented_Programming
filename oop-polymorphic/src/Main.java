public class Main {

	public static void main(String[] args) {
		/* TODO: 给一个有工资收入和稿费收入的小伙伴算税: 
		income税率10%
		salary5000以下不税、5000-10000以上5%税、1w以上7%税
		royalty稿费20%税
		*/
		Income[] incomes = new Income[] { 
				new Income(3000), 
				new SalaryIncome(7500), 
				new RoyaltyIncome(12000) 
				};
		
		System.out.println(totalTax(incomes));
		
	}
	
	public static double totalTax(Income...incomes) {
		double total = 0;
		for (Income income:incomes) {
			System.out.println(income.getTax());
			total = total + income.getTax();
		}
		return total;
	}

}

class Income{
	protected double income;
	
	public Income(double income) {
		this.income = income;
	}
	
	public double getTax() {
		return income * 0.1;
	}
}

class SalaryIncome extends Income{
	public SalaryIncome(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
		if (income < 5000) {
			return 0;
		}
		else if(income < 10000) {
			return (income - 5000)*0.05;
		}
		return (income - 10000)*0.07;
	}
}

class RoyaltyIncome extends Income{
	public RoyaltyIncome(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
		return income * 0.2;
	}
}
