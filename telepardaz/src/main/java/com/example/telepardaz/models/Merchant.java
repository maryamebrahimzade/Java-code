package com.example.telepardaz.models;

import com.example.telepardaz.enums.MerchantType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="merchant_type",
        discriminatorType = DiscriminatorType.STRING)
@Table(name = "merchant")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Merchant extends BaseEntity {
//    @Enumerated(EnumType.STRING)
//    private MerchantType merchantType;
    private String phone;
    private String mobile;
    private String email;
    private String website;
    private String iban;
    private String code;
    @OneToMany(mappedBy = "merchant")
    private List<QrCode> qrCodes;
}
