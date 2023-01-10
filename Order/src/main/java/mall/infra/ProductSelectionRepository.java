package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="productSelections", path="productSelections")
public interface ProductSelectionRepository extends PagingAndSortingRepository<ProductSelection, Long> {

    

    
}
