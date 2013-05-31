/**
 * 
 */
package com.soft.hunan.injury.dao.permission;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.BasicTransformerAdapter;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.soft.hunan.injury.dao.InjuryBaseDao;
import com.soft.hunan.injury.entity.permission.RoleInfo;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 *
 */

@Repository("roleDao")
public class RoleDao extends InjuryBaseDao<RoleInfo> implements IRoleDao {

	@Override
	public void findAllRoles(final PageHelper<RoleInfo> page) {
		// TODO Auto-generated method stub
		getHibernateTemplate().execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from RoleInfo");
				query.setFetchSize(page.getOffset());
				query.setMaxResults(page.getPageSize());
				
				page.setData(query.list());
				
				Projection projection = Projections.property("id");
				Criteria criteria = session.createCriteria(RoleInfo.class).setProjection(projection);
				page.setCount((Long) criteria.list().get(0));
				
				return null;
			}
		});
	}

	@Override
	public Set<RoleInfo> roles4Assign(final Long userid) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().execute(new HibernateCallback<Set<RoleInfo>>() {

			@Override
			public Set<RoleInfo> doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				SQLQuery roleidsquery = session.createSQLQuery("select distinct roles_id from user_role where user_id=?");
				roleidsquery.setLong(0, userid);
				final List roleids = roleidsquery.list();
				
				final Set<RoleInfo> roles = new HashSet<RoleInfo>();
				
				Query query = session.createQuery("from RoleInfo");
				query.setResultTransformer(new BasicTransformerAdapter() {
					@Override
					public List transformList(List collection) {
						// TODO Auto-generated method stub
						if(collection == null || collection.isEmpty())
							return null;
						
						Iterator<Object[]> it = collection.iterator();
						while(it.hasNext()){
							Object[] _roles = it.next();
							if(_roles.length < 1)
								continue;
							RoleInfo role = (RoleInfo) _roles[0];
							roles.add(role);
							if(roleids.contains(role.getId()))
								role.setChecked(true);
						}
						
						return collection;
					}
				});
				
				query.list();
				
				return roles;
			}
		});
	}

	
	
}
