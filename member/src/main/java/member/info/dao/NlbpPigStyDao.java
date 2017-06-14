package member.info.dao;

import java.util.List;
import java.util.Map;

//import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
//import com.github.miemiedev.mybatis.paginator.domain.PageList;

import member.info.domain.NlbpPigStyModel;

public interface NlbpPigStyDao {
	int deleteByPrimaryKey(Long id);

    int insert(NlbpPigStyModel record);

    int insertSelective(NlbpPigStyModel record);

    NlbpPigStyModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NlbpPigStyModel record);

    int updateByPrimaryKey(NlbpPigStyModel record);
    
    /**
     * 根据条件获取List
     * 
     * @param groupName
     * @return
     */
    public List<Map> getListByFilter(NlbpPigStyModel record);
    
    /**
     * 根据条件获取分页
     * 
     * @param groupName
     * @return
     */
//    public PageList getPageListByFilter(NlbpPigFilterBean param, PageBounds pageBounds);

	/**
	 * @author Jack
	 * @date: 2017年1月21日 上午9:05:11
	 * @param filter
	 * @return
	 */
	List<Map> getSty(NlbpPigStyModel filter);
	
	/**
	 * 查询List
	 * @author dugang
	 * @date: 2017年2月23日 下午3:11:20
	 * @param nlbpPigStyModel
	 * @return
	 */
	public List<NlbpPigStyModel> findList(NlbpPigStyModel nlbpPigStyModel);
    
}