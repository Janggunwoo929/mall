package mall.domain;

import mall.domain.Stockdecreased;
import mall.domain.Stockincreased;
import mall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Product_table")
@Data

public class Product  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productname;
    
    
    
    
    
    private String productimage;
    
    
    
    
    
    private String stock;

    @PostPersist
    public void onPostPersist(){


        Stockdecreased stockdecreased = new Stockdecreased(this);
        stockdecreased.publishAfterCommit();



        Stockincreased stockincreased = new Stockincreased(this);
        stockincreased.publishAfterCommit();

    }

    public static ProductRepository repository(){
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }




    public static void stockDecrease(Deliverycomplated deliverycomplated){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliverycomplated.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }
    public static void stockincrease(Deliveryreturned deliveryreturned){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryreturned.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }


}
