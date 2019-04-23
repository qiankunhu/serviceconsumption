package com.example.serviceconsumption.mapper;


import com.example.serviceconsumption.entity.BumenDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BumenMapper {


    public List<BumenDto> getlistAll();


    public void updateMoney();


}
