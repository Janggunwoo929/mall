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
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverystarted'")
    public void wheneverDeliverystarted_UpdateStatus(@Payload Deliverystarted deliverystarted){

        Deliverystarted event = deliverystarted;
        System.out.println("\n\n##### listener UpdateStatus : " + deliverystarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverycomplated'")
    public void wheneverDeliverycomplated_UpdateStatus(@Payload Deliverycomplated deliverycomplated){

        Deliverycomplated event = deliverycomplated;
        System.out.println("\n\n##### listener UpdateStatus : " + deliverycomplated + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverycancelled'")
    public void wheneverDeliverycancelled_UpdateStatus(@Payload Deliverycancelled deliverycancelled){

        Deliverycancelled event = deliverycancelled;
        System.out.println("\n\n##### listener UpdateStatus : " + deliverycancelled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliveryreturned'")
    public void wheneverDeliveryreturned_UpdateStatus(@Payload Deliveryreturned deliveryreturned){

        Deliveryreturned event = deliveryreturned;
        System.out.println("\n\n##### listener UpdateStatus : " + deliveryreturned + "\n\n");


        

        // Sample Logic //

        

    }

}


