package cn.itrip.dao.hotel;

import cn.itrip.beans.pojo.Hotel;

import java.util.List;

/**
 * 旅店的访问接口
 */
public interface HotelMapper {
    List<Hotel> getHotelList();
}
