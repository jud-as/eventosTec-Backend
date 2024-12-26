package com.eventostec.api.domain.coupon;


import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "coupon")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private String code;
    private Integer discount;
    private Long valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
