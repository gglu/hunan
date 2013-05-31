/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-30
 */
package com.soft.hunan.injury.service.dic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.hunan.injury.dao.InjuryBaseDao;
import com.soft.hunan.injury.dao.dic.IDictionaryDao;
import com.soft.hunan.injury.entity.dic.Dictionary;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.InjuryBaseService;
import com.soft.hunan.injury.service.permission.IDictionaryService;

/**
 * @author liwencheng
 *
 */

@Service("dictionaryService")
public class DictionaryService extends InjuryBaseService<Dictionary> implements IDictionaryService {

	@Autowired
	private IDictionaryDao dictionaryDao;
	
	@Override
	public InjuryBaseDao<Dictionary> obtainDao() {
		// TODO Auto-generated method stub
		return (InjuryBaseDao<Dictionary>) dictionaryDao;
	}

	@Override
	public void findAllDictionary(PageHelper<Dictionary> page) {
		// TODO Auto-generated method stub
		dictionaryDao.findAllDictionary(page);
	}

	

}
