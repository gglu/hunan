/**
 * Copyright 2012-2020 www.hunan.com
 * All right reserved.
 * created by liwencheng 2013-5-30
 */
package com.soft.hunan.injury.service.permission;

import com.soft.hunan.injury.entity.dic.Dictionary;
import com.soft.hunan.injury.helper.PageHelper;
import com.soft.hunan.injury.service.IInjuryBaseService;

/**
 * @author liwencheng
 *
 */
public interface IDictionaryService extends IInjuryBaseService<Dictionary> {

	void findAllDictionary(PageHelper<Dictionary> page);

}
