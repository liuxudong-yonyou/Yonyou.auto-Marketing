package yonyou.marketing.api.user.services;

import yonyou.marketing.api.user.entity.SysUser;

/**
 * @author BENJAMIN
 *
 * dubbo服务user的API
 */
public interface UserService {
	/**
	 * 保存用户信息.
	 * @param pmsUser
	 */
	public void create(SysUser pmsUser);
	
	/**
	 * 根据ID获取用户信息.
	 * @param userId
	 * @return
	 */
	public SysUser getById(Long userId);

	/**
	 * 根据登录名取得用户对象
	 */
	public SysUser findUserByUserNo(String userNo);

	/**
	 * 根据ID删除一个用户，同时删除与该用户关联的角色关联信息. type="1"的超级管理员不能删除.
	 * 
	 * @param id
	 *            用户ID.
	 */
	public void deleteUserById(long userId);

	
	/**
	 * 更新用户信息.
	 * @param user
	 */
	public void update(SysUser user);
	
	/**
	 * 根据用户ID更新用户密码.
	 * 
	 * @param userId
	 * @param newPwd
	 *            (已进行SHA1加密)
	 */
	public void updateUserPwd(Long userId, String newPwd, boolean isTrue);


}
