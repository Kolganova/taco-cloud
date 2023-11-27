package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.TacoOrder;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
    List<TacoOrder> readTacoOrderByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
    List<TacoOrder> findByDeliveryNameAndDeliveryCityAllIgnoreCase(String deliveryName, String deliveryCity);
    List<TacoOrder> findByDeliveryCityOrderByDeliveryCity(String deliveryCity);

}
