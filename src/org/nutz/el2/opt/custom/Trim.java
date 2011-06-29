package org.nutz.el2.opt.custom;

import java.util.List;

import org.nutz.el2.El2Exception;
import org.nutz.el2.opt.RunMethod;

public class Trim implements RunMethod{
	public Object run(List<Object> fetchParam) {
		if(fetchParam.size() <= 0){
			throw new El2Exception("trim方法参数错误");
		}
		String obj = (String) fetchParam.get(0);
		return obj.trim();
	}

}