
public class Client {

	public static void main(String args[]) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		ConcreteObserverOne concreteOberverOne = new ConcreteObserverOne();
		ConcreteObserverTwo concreteOberverTwo = new ConcreteObserverTwo();
		ConcreteObserverThree concreteOberverThree = new ConcreteObserverThree();
		
		concreteSubject.addObserver(concreteOberverOne);
		concreteSubject.addObserver(concreteOberverTwo);
		concreteSubject.addObserver(concreteOberverThree);
		
		concreteSubject.action();
	}
}
