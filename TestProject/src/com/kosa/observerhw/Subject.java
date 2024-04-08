package com.kosa.observerhw;

public interface Subject {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
