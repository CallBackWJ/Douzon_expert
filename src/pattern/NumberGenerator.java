package pattern;

import java.util.ArrayList;

public abstract class NumberGenerator implements Subject{

	ArrayList<Observer> observers;
	int num;
	public abstract int getNum();
	public abstract void execute();
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}
}
