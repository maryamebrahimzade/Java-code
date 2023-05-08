package ir.mapsa.telepayer.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="merchants")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Merchant extends AbstractEntity{
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String accountNumber;
    @Column(nullable = false)
    private String cardNumber;
    @Column(unique = true, nullable = false)
    private String merchantId;
}
