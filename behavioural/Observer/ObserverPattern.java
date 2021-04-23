package behavioural.Observer;
//      The Observer pattern facilitates good object-oriented designs as it promotes loose coupling.  Observers register and
//unregister themselves with subjects that maintain a list of interested observers.  The subject does not depend
//on any particular observer, as long as the delegates are of the correct type for the event.
//      The event and delegate paradigm in .NET represents an elegant and powerful implementation of
//the Observer design pattern.
//      The observer pattern defines a one-to-many dependency between objects so that when one object changes state,
//all of its dependents are notified and updated automatically.
//      The object which is being watched is called the subject. The objects which are watching the state changes
//are called OBSERVERS or LISTENERS.
//      The observer pattern allows for the Open Closed principle. This principle states that a class should be open
// for extensions without the need to change the class.
//      Using the observer pattern a subject can register an unlimited number of observers. If a new listener wants
//to register with the subject, no code change in the subject is necessary.
//      Using the listener pattern decouples the subject from its observers.
//Only the observers have direct knowledge about the subject.

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);
        station.setHumidity(100);
        station.setPressure(1000);
        station.setTemperature(30);
        station.setPressure(999);
    }
}
