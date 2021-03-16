package manager;
import domain.Offer;
import repository.OfferRepository;

import java.util.Arrays;
import java.util.Comparator;


public class OfferManager  {
    OfferRepository repository = new OfferRepository();

    public void add(Offer offer) {
        repository.save(offer);
    }


    public Offer[] findByAirport(String to, String from, Comparator<Offer> comparator) {
        Offer[] result = new Offer[0];
        for (Offer offer : repository.findAll()) {
            if (offer.getTo().equals(to) & offer.getFrom().equals(from)) {
                Offer[] tmp = new Offer[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = offer;
                result = tmp;
            }
        }
        Arrays.sort(result, comparator);
        return result;
    }


}