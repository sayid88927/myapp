package com.app.service.impl;

import com.app.mapper.TCarouselsMapper;
import com.app.model.TCarousels;
import com.app.service.CarouselsService;
import com.bben.common.util.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "CarouselsService")
public class CarouselsServiceImpl implements CarouselsService {


    @Autowired
    private TCarouselsMapper carouselsMapper;


    @Override
    public List<TCarousels> findAll() {
        List<TCarousels> tCarouselsList = carouselsMapper.selectByExample(null);
        if (A.isEmpty(tCarouselsList)){
            return null;
        }
        return tCarouselsList;
    }
}
