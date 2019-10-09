package com.jacob.oberserpattern.subject;

import com.jacob.oberserpattern.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
