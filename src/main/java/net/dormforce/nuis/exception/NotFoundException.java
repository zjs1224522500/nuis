/*
 * 网络管理委员会信息管理系统 ( NetUnion Information System )
 * Copyright (c) 2017.
 */

package net.dormforce.nuis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Description: 404 not found 异常，使用@ResponseStatus处理响应结果
 * <br/>Author: liuwenzhe
 * <br/>Date: 2017/4/19, 星期三
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
}
