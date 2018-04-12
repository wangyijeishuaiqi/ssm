package com.wyj.ssm.service;

import com.wyj.ssm.pojo.Air_quality_index;

import java.util.List;
import java.util.Map;

public interface Air_quality_indexService {

    List<Air_quality_index> Air_quality_indexfind(Map<String, Object> map);

    int Air_quality_indexCount();

    int addAir_quality_index(Air_quality_index air_quality_index);

    int updateAir_quality_index(Air_quality_index air_quality_index);

    int delAir_quality_index(int id);

    Air_quality_index Air_quality_indexbyid(int id);
}
