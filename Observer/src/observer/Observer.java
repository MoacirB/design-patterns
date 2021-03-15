package observer;

/**
 *
 * @author Moacir
 */
public interface Observer {
    /*Objeto a ser informado caso os dados relevantes de Subject sejam alterados*/
    public void update(float temperature, float humidity, float pressure);//Subject chama este método quando precisa atualizar os dados
}
