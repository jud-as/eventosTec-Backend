package com.eventostec.api.domain.coupon;

import com.eventostec.api.domain.event.Event;

import java.util.Date;

public record CouponRequestDTO (Integer discount, Date date, Event event){
}
