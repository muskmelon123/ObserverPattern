
public class ConcreteSubject extends Subject {

	@Override
	public void action() {
		System.out.print("ConcreteSubject acton!\n");
		// TODO Auto-generated method stub
		for(Observer observer:observers) {
			observer.update();
		}
	}

}
