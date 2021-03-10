package observer.subject;

import observer.observer.Observer;

/**
 *
 * @author Moacir
 */
public interface Subject {
    /*Objeto com dados relevantes, que serão notificados caso mudem, para os Observers, */
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();//Este método notifica os observers quando os dados mudarem
}
