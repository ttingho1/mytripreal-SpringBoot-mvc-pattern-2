package com.example.mytripreal.mapper;

import com.example.mytripreal.vo.RoomVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.ModelMap;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface RoomMapper {

    // 메인페이지 - 객실미리보기
    List<RoomVo> getRoomList(ModelMap mm);

    // 객실 상세보기
    RoomVo getRoomInfo(String room_No);

    // 빈 객실 모두 불러오기(결제확정여부 N)
    List<RoomVo> getEmptyRoom(ModelMap mm);
}
