package yonyou.marketing.api.user.services;

import java.util.List;
import java.util.Map;

import yonyou.marketing.api.user.entity.UserDto;


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
	public void create(UserDto pmsUser);
	
	/**
	 * 根据ID获取用户信息.
	 * @param userId
	 * @return
	 */
	public UserDto getById(Long userId);

	/**
	 * 根据登录名取得用户对象
	 */
	public UserDto findUserByUserNo(String userNo) throws Exception  ;
	
	//test 
	public String findUserByNo(String name);

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
	public void update(UserDto user);
	
	/**
	 * 根据用户ID更新用户密码.
	 * 
	 * @param userId
	 * @param newPwd
	 *            (已进行SHA1加密)
	 */
	public void updateUserPwd(Long userId, String newPwd, boolean isTrue);
	
	
	
	/**
	 *  查询用户拥有的菜单
	 * 
	 * @param queryMap
	 * @return
	 * @throws Exception
	 */
	public List<Map> getMenuByUser(Map queryMap) throws Exception  ;


}
