package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="ProductSelection_table")
@Data
public class ProductSelection {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
