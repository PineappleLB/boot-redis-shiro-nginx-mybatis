package club.pinea.school.service;

import club.pinea.school.model.SysUser;

public interface JedisService {
	
	/**
	 * 校验图片验证码是否正确
	 * @param sessionId
	 * @param imgCode
	 * @return
	 */
	boolean validateImgCode(String sessionId, String imgCode);
	
	/**
	 * 设置图片验证码值
	 * @param sessionId
	 * @param imgCode
	 */
	void setImgCode(String sessionId, String imgCode);

	/**
	 * 在redis中检查是否有该用户
	 * @param sessionId
	 * @return
	 */
	SysUser authUser(String sessionId);

	/**
	 * 将redis里面存储的user数据删除
	 * @param sessionId
	 * @return
	 */
	int logout(String sessionId);

	/**
	 * 从redis中查询用户信息
	 * @param sessionId
	 * @return
	 */
	SysUser getUser(String sessionId);

}
