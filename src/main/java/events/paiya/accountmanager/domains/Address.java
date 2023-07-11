package events.paiya.accountmanager.domains;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String country;
    private String city;
    private String state;
    private String postal;
    private String adressDetail;
}