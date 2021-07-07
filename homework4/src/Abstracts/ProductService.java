package Abstracts;
import Entities.*;
public interface ProductService {
    public void sell(Gamer gamer,Game game,Campaign campaign);
    public void refund(Gamer gamer,Game game);
}
