package mall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import mall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import mall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired ProductRepository productRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverycomplated'")
    public void wheneverDeliverycomplated_StockDecrease(@Payload Deliverycomplated deliverycomplated){

        Deliverycomplated event = deliverycomplated;
        System.out.println("\n\n##### listener StockDecrease : " + deliverycomplated + "\n\n");


        

        // Sample Logic //
        Product.stockDecrease(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliveryreturned'")
    public void wheneverDeliveryreturned_Stockincrease(@Payload Deliveryreturned deliveryreturned){

        Deliveryreturned event = deliveryreturned;
        System.out.println("\n\n##### listener Stockincrease : " + deliveryreturned + "\n\n");


        

        // Sample Logic //
        Product.stockincrease(event);
        

        

    }

}


