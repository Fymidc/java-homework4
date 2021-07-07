import Concrete.*;
import Entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Gamer gamer = new Gamer();
        GamerManager gamerManager = new GamerManager();

        gamer.setFirstName("fatih");
        gamer.setLastName("bodur");
        gamer.setTcNo("10011010101010");
        gamer.setYearofBirth("191919");
        
        gamerManager.Signup(gamer);

        Game game = new Game();
        game.setGameName("FİFA21");
        game.setContent("Dunyanin en populer futbol oyunu");

        //50 tl aldına indirim uygulanmıyor!
        game.setPrice(150.00);

        Campaign campaign = new Campaign();
        campaign.setCampaignName("50 tl ve uzeri alisveris lerde indirim");
        campaign.setDiscountRate(10);
        
        CampaignManager campaignManager=new CampaignManager();
        campaignManager.addCampaign(game, campaign);
        
        ProductManager productManager = new ProductManager();
        productManager.sell(gamer, game, campaign);


    }
}
