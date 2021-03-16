package repository;

import domain.Offer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class OfferRepository {
    private Offer[] offers = new Offer[0];

    public void save(Offer offer) {
        int length = offers.length + 1;
        Offer[] tmp = new Offer[length];
        System.arraycopy(offers, 0, tmp, 0, offers.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = offer;
        offers = tmp;
    }

    public Offer[] findAll() {
        return offers;
    }

    public void removeById(int id) {
        int length = offers.length - 1;
        Offer[] tmp = new Offer[length];
        int index = 0;
        for (Offer offer : offers) {
            if (offer.getId() != id) {
                tmp[index] = offer;
                index++;
            }
        }
        offers = tmp;
    }

}
