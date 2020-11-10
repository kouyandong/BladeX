/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package org.springblade.core.log.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springblade.core.log.dto.LogApiDto;
import org.springblade.core.log.mapper.LogApiMapper;
import org.springblade.core.log.model.LogApi;
import org.springblade.core.log.service.ILogApiService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author Chill
 */
@Service
public class LogApiServiceImpl extends ServiceImpl<LogApiMapper, LogApi> implements ILogApiService {

	/**
	 * 自定义分页查询
	 * @param page
	 * @param logApiDto
	 * @return
	 */
	public IPage<LogApi> selectLogApiPage(IPage<LogApi> page, LogApiDto logApiDto){
		return page.setRecords(baseMapper.selectLogApiPage(page, logApiDto));
	}
}