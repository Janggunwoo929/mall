package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordercanceled extends AbstractEvent {

    private Long id;
    private String cutomerid;
    private String productid;
    private String productname;
    private String status;
    private String qty;
    private String address;

    public Ordercanceled(Order aggregate){
        super(aggregate);
    }
    public Ordercanceled(){
        super();
    }
}
