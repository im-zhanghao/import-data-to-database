package cn.cloudx.importdata.repository.company;

import cn.cloudx.importdata.entity.company.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanghao
 * @date 2018/06/27
 */
public interface CompaniesRepository extends JpaRepository<Companies, Integer> {
}
