/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-30
 */
package com.soft.hunan.injury.dao.dic;

import com.soft.hunan.injury.entity.dic.Dictionary;
import com.soft.hunan.injury.helper.PageHelper;

/**
 * @author liwencheng
 *
 */
public interface IDictionaryDao {

	void findAllDictionary(PageHelper<Dictionary> page);

}
