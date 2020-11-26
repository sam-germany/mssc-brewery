package guru.springframework.msscbrewery.domain;

import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;

}

// Timestamp timestamp = new Timestamp(System.currentTimeMillis());

//        System.out.println(timestamp);                  //2016-11-16 06:43:19.77
//
//        //method 2 - via Date
//        Date date = new Date();
//        System.out.println(new Timestamp(date.getTime()));   // 2016-11-16 06:43:19.769
//
//        //return number of milliseconds since January 1, 1970, 00:00:00 GMT
//        System.out.println(timestamp.getTime());       // 1479249799770
//
//        //format timestamp
//        System.out.println(sdf.format(timestamp));       //2016.11.16.06.43.19



