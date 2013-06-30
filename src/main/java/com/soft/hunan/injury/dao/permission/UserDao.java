/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-28
 */
package com.soft.hunan.injury.dao.permission;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.soft.hunan.injury.dao.InjuryBaseDao;
import com.soft.hunan.injury.entity.permission.UserInfo;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 * 
 */
@Repository("userDao")
public class UserDao extends InjuryBaseDao<UserInfo> implements IUserDao{

	@Override
	public UserInfo findUserByAccount(String account) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find("from UserInfo where account=?",account);
		if(list == null || list.isEmpty())
			return null;
		return (UserInfo) list.get(0);
	}

	@Override
	public List<UserInfo> findAllUsers(final PageHelper<UserInfo> page) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().executeFind(new HibernateCallback<List<UserInfo>>() {
			@Override
			public List<UserInfo> doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				
//				Criterion criterion = Restrictions.eq("account", "admin");
				Criteria c = session.createCriteria(UserInfo.class);//.add(criterion);
				c.setFirstResult(page.getOffset());
				c.setMaxResults(page.getPageSize());
				
				c.setFetchMode("organize", FetchMode.SELECT);
				
				page.setData(c.list());
				
//				Query query  = session.createQuery("from UserInfo ");
//				query.setFirstResult(page.getOffset());
//				query.setMaxResults(page.getPageSize());
//				page.setData(query.list());

				Projection projection = Projections.count("id");
				
				Criteria criteria = session.createCriteria(UserInfo.class).setProjection(projection);
				
				page.setCount((Long) criteria.list().get(0));
				
				return page.getData();
			}
		});
	}
	
	

	
}
