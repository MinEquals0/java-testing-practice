package com.minequals0.order.dto;

import com.minequals0.member.entity.Member;
import com.minequals0.order.entity.Order;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class OrderResponseDto {
    private long orderId;

    @Setter(AccessLevel.NONE)
    private long memberId;
    private Order.OrderStatus orderStatus;
    private List<OrderCoffeeResponseDto> orderCoffees;
    private LocalDateTime createdAt;

    public void setMember(Member member) {
        this.memberId = member.getMemberId();
    }
}
