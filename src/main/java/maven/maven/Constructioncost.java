package maven.maven;
import java.util.*;
public class Constructioncost {
	Constructioncost(double area){
		Scanner sc=new Scanner(System.in);
		double feets=area/10.764;
		double cc;
		//1.Standard House 2.Above Standard House 3.High Standard House 4.High Standard House and Fully Automated House
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1 : cc=1200*feets;
				 break;
		case 2 :cc=1500*feets;
				break;
		case 3 : cc=1800*feets;
				 break;
		case 4 :cc=2100*feets;
				 break;
		default : break;
		}
		sc.close();
	}
}
