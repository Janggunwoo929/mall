package mall.domain;

import mall.domain.Deliverystarted;
import mall.domain.Deliverycancelled;
import mall.domain.Deliveryreturned;
import mall.domain.Deliverycomplated;
import mall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderid;
    
    
    
    
    
    private String productid;
    
    
    
    
    
    private String productname;
    
    
    
    
    
    private String adress;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        Deliverystarted deliverystarted = new Deliverystarted(this);
        deliverystarted.publishAfterCommit();



        Deliverycancelled deliverycancelled = new Deliverycancelled(this);
        deliverycancelled.publishAfterCommit();



        Deliveryreturned deliveryreturned = new Deliveryreturned(this);
        deliveryreturned.publishAfterCommit();



        Deliverycomplated deliverycomplated = new Deliverycomplated(this);
        deliverycomplated.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }




    public static void startDelivery(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }
    public static void cancelDelivery(Ordercanceled ordercanceled){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordercanceled.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }


}
