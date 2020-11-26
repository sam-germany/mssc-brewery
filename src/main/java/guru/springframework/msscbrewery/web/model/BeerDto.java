package guru.springframework.msscbrewery.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastUpdated;
}

/*
https://www.dariawan.com/tutorials/java/java-offsetdatetime-tutorial-examples/

https://www.logicbig.com/how-to/code-snippets/jcode-java-8-date-time-api-offsetdatetime-format.html

main point is that  OffsetDateTime we will get the zone time

 */


