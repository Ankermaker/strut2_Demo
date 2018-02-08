package AnkerAction;

import com.opensymphony.xwork2.Action;
/**
 * @author Ankermaker
 *
 *         Feb 8, 2018
 */
public class UsersAction implements Action {

	// 添加 用户操作
	public String Add() {
		// 数据的添加操作
		return "success";
	}

	public void List() {
		// 数据的添加操作

		
		System.out.println("list 操作 已经处理过");
//		return "success";
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
