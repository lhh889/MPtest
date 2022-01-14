package com.itlhh.dao;

import com.itlhh.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2022-01-14
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
