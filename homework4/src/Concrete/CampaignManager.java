package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService{

    @Override
    public double Discount(Game game, Campaign campaign) {
        double newPrice = 0;
        
        if(game.getPrice()>49.99){
            newPrice=game.getPrice()*(campaign.getDiscountRate()/100);
        }else{
            newPrice=game.getPrice();
        }
        return newPrice;
    }

    @Override
    public void addCampaign(Game game, Campaign campaign) {
        System.out.println(game.getGameName()+"adli oyun kampanyaya eklendi");
        
    }
    
}
