package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="orderInquiries", path="orderInquiries")
public interface OrderInquiryRepository extends PagingAndSortingRepository<OrderInquiry, Long> {

    

    
}
