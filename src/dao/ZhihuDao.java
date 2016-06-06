package dao;

import entity.ZhihuUser;

/**
 * 知乎 数据持久化 接口
 * @author 甘海彬
 *
 */
public interface ZhihuDao {
	/**
	 * 保存用户信息
	 * @param user
	 * @return
	 */
	public int saveUser(ZhihuUser user);
}
