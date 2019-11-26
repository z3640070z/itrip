package cn.itrip.biz.service.hotel.impl;

import cn.itrip.beans.pojo.Hotel;
import cn.itrip.biz.service.hotel.HotelService;
import cn.itrip.dao.hotel.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelMapper hotelMapper;
    @Override
    public List<Hotel> getHotels() {
        return hotelMapper.getHotelList();
    }
}
