package beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockMinException extends Exception{

    public BeerStockMinException(Long id, int quantityToDecrement){
        super(String.format("Beers with %s ID to decrement informed exceeds the min of zero in stock: %s", id, quantityToDecrement));
    }
}
