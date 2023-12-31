package com.zytd.account.books.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zytd.account.books.model.UserManage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zytd.account.books.param.user.UserManagerListGetParam;

import java.util.List;

/**
 * <p>
 * 用户管理 服务类
 * </p>
 *
 * @author wl
 * @since 2023-10-30
 */
public interface UserManageService extends IService<UserManage> {

    /**
     * 根据类型拉取列表
     */
    List<UserManage> queryByTypeAndMemberId(Integer type, Long memberId);

    Page<UserManage> pages(UserManagerListGetParam param);
}
