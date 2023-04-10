package observerpattern.observerinterface;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(); // 객체 상태 변경 시 참조중인 객체들 호출
}
