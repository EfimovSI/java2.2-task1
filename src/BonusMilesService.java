public class BonusMilesService {
    public int calculate (int cost) {

        int mileCost = 20;
        int bonusMiles = cost / mileCost;
        return bonusMiles;
    }
}
