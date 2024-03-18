package br.com.github.JBreno.desafio.services;

import br.com.github.JBreno.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        if(order.getBasic() >= 200) {
            return 0.0;
        } else if(order.getBasic() >= 100) {
            return 12.00;
        }

        return 20.00;
    }

}
