package mall.domain;

import mall.domain.OrderPlaced;
import mall.domain.Ordercanceled;
import mall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String cutomerid;
    
    
    
    
    
    private String productid;
    
    
    
    
    
    private String productname;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String qty;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        Ordercanceled ordercanceled = new Ordercanceled(this);
        ordercanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
