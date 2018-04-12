package com.wyj.ssm.service.impl;

import com.wyj.ssm.mapper.Air_quality_indexMapper;
import com.wyj.ssm.pojo.Air_quality_index;
import com.wyj.ssm.service.Air_quality_indexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Air_quality_indexServiceimpl implements Air_quality_indexService {
    @Autowired
    Air_quality_indexMapper air_quality_indexMapper;

    @Override
    public List<Air_quality_index> Air_quality_indexfind(Map<String, Object> map) {
        // TODO Auto-generated method stub
        return air_quality_indexMapper.Air_quality_indexfind(map);
    }

    @Override
    public int Air_quality_indexCount() {
        // TODO Auto-generated method stub
        return air_quality_indexMapper.Air_quality_indexCount();
    }

    @Override
    public int addAir_quality_index(Air_quality_index air_quality_index) {
        // TODO Auto-generated method stub
        return air_quality_indexMapper.addAir_quality_index(air_quality_index);
    }

    @Override
    public int updateAir_quality_index(Air_quality_index air_quality_index) {
        // TODO Auto-generated method stub
        return air_quality_indexMapper.updateAir_quality_index(air_quality_index);
    }

    @Override
    public int delAir_quality_index(int id) {
        // TODO Auto-generated method stub
        return air_quality_indexMapper.delAir_quality_index(id);
    }

    @Override
    public Air_quality_index Air_quality_indexbyid(int id) {
        // TODO Auto-generated method stub
        return air_quality_indexMapper.Air_quality_indexgetId(id);
    }

}
