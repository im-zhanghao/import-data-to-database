package cn.cloudx.importdata.repository;

import cn.cloudx.importdata.entity.Itemstatus;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanghao
 * @date 2018/06/13
 */
public interface ItemStatusRepository extends JpaRepository<Itemstatus,Integer> {
}
