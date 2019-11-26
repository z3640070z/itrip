package cn.itrip.biz.controller;


import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.Hotel;
import cn.itrip.biz.service.hotel.HotelService;
import cn.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @RequestMapping(value = "/hotel/queryhotels",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public Dto queryHotels(){
        List<Hotel> hotels = hotelService.getHotels();
        Dto dto = DtoUtil.returnSuccess("成功返回旅馆数据",hotels);
        return dto;
    }
}
