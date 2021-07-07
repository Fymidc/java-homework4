package Concrete;

import java.text.DecimalFormat;

import Abstracts.ProductService;
import Entities.*;

public class ProductManager implements ProductService{


    @Override
    public void sell(Gamer gamer, Game game, Campaign campaign) {
    
        CampaignManager campaignManager=new CampaignManager();

        double newPrice = 0;
         DecimalFormat df = new DecimalFormat("#.##");
         
        //double profit = game.getPrice()-newPrice;
        //                      150-135
        newPrice =campaignManager.Discount(game, campaign);

        if(game.getPrice()<50.00){
            System.out.println("50.00 TL den düsük fiyatlarda indirim yok!");
            System.out.println("sectiginiz oyun adi "+game.getGameName()+"sectiginiz oyun fiyati"+game.getPrice());
        }else{
            System.out.println("sectiginiz oyun adi "+game.getGameName()+"\nsectiginiz oyun fiyati\n"+game.getPrice());
            System.out.println("sectiginiz oyun inidirimli katagoride!!  " + game.getGameName()+"\nindirimli  fiyatı:\n"+ (game.getPrice()- newPrice) + " \nkazancınız:\n " +df.format(newPrice));

        }
        System.out.println(gamer.getFirstName()+"  "+game.getGameName()+"  oyununu satin aldi");
        
    }

    @Override
    public void refund(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName()+"adli kullanici "+game.getGameName()+"adli oyunu geri iade etti");
        
    }
    
}
