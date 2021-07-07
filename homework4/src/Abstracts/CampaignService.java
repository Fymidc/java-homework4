package Abstracts;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
    public double Discount(Game game,Campaign campaign);
    public void addCampaign(Game game,Campaign campaign);
}
