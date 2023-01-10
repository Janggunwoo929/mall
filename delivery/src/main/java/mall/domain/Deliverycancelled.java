package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Deliverycancelled extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String productid;
    private String productname;
    private String adress;
    private String status;

    public Deliverycancelled(Delivery aggregate){
        super(aggregate);
    }
    public Deliverycancelled(){
        super();
    }
}
