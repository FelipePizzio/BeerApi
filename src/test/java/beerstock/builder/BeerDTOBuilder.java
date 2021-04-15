package beerstock.builder;

import lombok.Builder;
import beerstock.dto.BeerDTO;
import beerstock.enums.BeerType;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Brahma";

    @Builder.Default
    private final String brand = "Ambev";

    @Builder.Default
    private final int max = 50;

    @Builder.Default
    private final int quantity = 10;

    @Builder.Default
    private final BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
