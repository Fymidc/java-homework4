package Abstracts;

import Entities.Gamer;

public interface GamerService {
    public boolean Signup(Gamer Gamer);
    public void update(Gamer Gamer);
    public void delete(Gamer Gamer);

}
