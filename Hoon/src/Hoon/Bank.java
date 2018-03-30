package Hoon;

public class Bank {
	double getInterestRast(){
		return 0.0;
	}
}
class Badbank extends Bank {
	double getInterestRast(){
		return 10.0;
	}
}
class Nomalbank extends Bank {
	double getInterestRast(){
		return 5.0;
	}
}
class Goodbank extends Bank {
	double getInterestRast(){
		return 3.0;
	}
}
                                                                                                                                                              