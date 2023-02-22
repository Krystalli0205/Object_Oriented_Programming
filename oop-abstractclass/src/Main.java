public class Main {

	public static void main(String[] args) {
		// TODO: 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] { 
				new SalaryIncome(7500), 
				new RoyaltyIncome(12000) 
				};
		
		// TODO:
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

//定义abstract Income类
abstract class Income{
	protected double income;
	
	public abstract double getTax();
}

//Salary：<5000不税、>=5000税20%
class SalaryIncome extends Income{
	public SalaryIncome(double income) {
		this.income = income;
	}
	
	@Override
	public double getTax() {
		if (income < 5000) {
		return 0;
		}
		return (income - 5000) * 0.2;
	}
}

//Royalty: 全部税30%
class RoyaltyIncome extends Income{
	public RoyaltyIncome(double income) {
		this.income = income;
	}
	
	public double getTax() {
		return income * 0.3;
	}
}