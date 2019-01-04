package coffeeMaker;

public interface CoffeeMakerAPI {
	
	/*
	 * 시나리오
	 * 커피메이커는 한번에 커피를 최대 12잔까지 만들수 있다.
	 * 사용자는 [필터 받침]에 [필터]를 올려놓고, 필터에 커피가루를 채운다음, 필터 받침을 기계의 제자리에 밀어넣는다.
	 * 사용자는 최대 12잔 분량의 물을 [여과기]에 붓고, 끓임(Brew)버튼을 눌러 끓을 때까지 계속 계속 물을 데운다.
	 * 증기압이 점점 세지면서 물이 커피가루 위에 뿌려지고, 만들어진 커피 방울이 필터를 거쳐 주전자로 떨어진다.
	 * 주전자는 온열판위에 놓여 있어서 일정한 시간 동안 따듯하게 유지되는데, 이 온열판(WarmerPlate)은 주전자에 커피가 있을때만 작동한다.
	 * 만약 커피 가루 위에 물을 뿌리는동안 온열판에서 주전자를 치우면, 끓은 커피를 온열판 위에 흘리지 않도록 물의 흐름을 멈추어야 한다.
	 */
	

	
	/*
	 * 온열판 감지기의 상태를 반환
	 * 상태 1:온열판 위에 주전자가 있는지
	 * 상테 2:만약있다면 커피가 주전자 안에 들어있는지!
	 */
	public int getWarmerPlateStatus();
	public static final int WARMER_EMPTY=0;//온열판 위에 주전자가 없다.
	public static final int POT_EMPTY=1;//온열판 위에 주전자는 있고, 커피는 없다.
	public static final int POT_NOT_EMPTY=2;//온열판 위에 주전자도 있고 커피도 있다.
	
	/*
	 * 보일러의 스위치 상태를 반환한다.
	 * 보일러 안에 물이 얼마나 있는지 감지
	 */
	public int getBoilerStatus();
	public static final int BOILER_EMPTY=0;//보일러 안에 물이 반잔 이하있다.
	public static final int BOILER_NOT_EMPTY=1;//보일러 안에 물이 반잔 이상있다.
	
	/*
	 * 이 함수는 끓임 버튼의 상태를 반환한다.
	 */
	public int getBrewButtonStatus();
	public static final int BREW_BUTTON_PUSHED=0;
	public static final int BREW_BUTTON_NOT_PUSHED=1;
	
	
	/*
	 *  이 함수는 보일러의 가열기를 켜거나 끊다.
	 */
	public void setWarmerState(int warmerState);
	public static final int WARMER_ON=0;
	public static final int WARMER_OFF=1;
	
	
	/*
	 * 이 함수는 끓임 버튼의 알림장치의 불을 켜거나 끈다.
	 * 
	 */
	public void setIndicatorState(int indicatorState);
	public static final int INDICATOR_ON=0;
	public static final int INDICATOR_OFF=1;
	
	
	/*
	 * 이 함수는 압력 완화 밸브를 열거나 닫는다.
	 * 벨브가 닫혔으면 끓이는 장치의 증기압력이 뜨거운물을 커피 필터 위에 뿌린다.
	 * 뻴브가 열리면, 끓이는 장치의 증기가 바깥으로 빠져나가므로, 끓이는 장치의 물이 뿌려지지 않는다.
	 */
	public void setReliefValveState(int reliefValveState);
	public static final int VELVE_OPEN=0;
	public static final int VELVE_CLOSED=1;
	
	
	
	
}
