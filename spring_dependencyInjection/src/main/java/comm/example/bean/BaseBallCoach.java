package comm.example.bean;

import lombok.Setter;

@Setter
public class BaseBallCoach implements Coach {

	private FortuneService fortuneServices;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice backvolley today.!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServices.getFortune();
	}

}
