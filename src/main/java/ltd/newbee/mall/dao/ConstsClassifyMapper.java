package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.ConstsClassify;

public interface ConstsClassifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstsClassify record);

    int insertSelective(ConstsClassify record);

    ConstsClassify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConstsClassify record);

    int updateByPrimaryKey(ConstsClassify record);
}