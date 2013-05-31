/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-30
 */
package com.soft.hunan.injury.dao.dic;

import java.sql.SQLException;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.soft.hunan.injury.dao.InjuryBaseDao;
import com.soft.hunan.injury.entity.dic.Dictionary;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 *
 */

@Repository("dictionaryDao")
public class DictionaryDao extends InjuryBaseDao<Dictionary> implements IDictionaryDao {

	@Override
	public void findAllDictionary(final PageHelper<Dictionary> page) {
		// TODO Auto-generated method stub
		getHibernateTemplate().executeFind(new HibernateCallback<Void>() {
			@Override
			public Void doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query  = session.createQuery("from Dictionary");
				
				query.setFirstResult(page.getOffset());
				query.setMaxResults(page.getPageSize());
				
				page.setData(query.list());
				
				Projection projection = Projections.count("id");
				
				Criteria criteria = session.createCriteria(Dictionary.class).setProjection(projection);
				
				page.setCount((Long) criteria.list().get(0));
				
				return null;
			}
		});
	}

	
}
