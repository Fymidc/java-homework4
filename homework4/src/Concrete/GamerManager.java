package Concrete;

import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

    @Override
    public boolean Signup(Gamer gamer) {
        if(gamer.getFirstName().length()<=0 ||gamer.getLastName().length()<=0 || gamer.getTcNo().length()<=0 || gamer.getYearofBirth().length()<=0){
            System.out.println("Eksik bilgi girdiniz!!");
            return false;
        }else{
            System.out.println(gamer.getFirstName() + " adlı kullanıcı kayıt edildi");
            return true;
        }
        
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getTcNo()+"tc kimlik numaralı kullanıcı güncellendi");        
        
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getTcNo()+"tc kimlik numaralı kullanıcı kaydı silindi");
        
    }
    
}
