package cn.alipapa.seat.controller;

import cn.alipapa.seat.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
    @Autowired
    SeatService seatService;

    @GetMapping("/public/get_remaining_seats")
    public Object getRemainingSeats() {
        return seatService.getRemainingSeatsOfEachLevel();
    }
}