package maven.maven;
public class Simple_compound_interest {
	Simple_compound_interest(double principal_amount,double rate_of_interest,double time){
		double simple_interest,compound_interest;
		simple_interest=(principal_amount * time * rate_of_interest)/100;
		compound_interest=principal_amount * Math.pow(1.0+rate_of_interest/100.0,time) - principal_amount;
	}
}
