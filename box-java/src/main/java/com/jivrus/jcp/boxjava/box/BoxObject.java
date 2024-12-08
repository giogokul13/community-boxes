package com.jivrus.jcp.boxjava.box;

import java.util.List;
import java.util.Map;

import com.jivrus.jcp.boxjava.common.Descriptive;
import com.jivrus.jcp.boxjava.common.query.Attribute;
import com.jivrus.jcp.boxjava.common.query.Result;

public interface BoxObject extends Descriptive {

	List<Attribute> getAttributes(String objectName, String pattern) throws Exception;

	BoxFunction getFunction(String id) throws Exception;

	List<BoxFunction> getFunctions(String pattern);

	Result executeFunction(String functionId, Map<String, Object> functionOptions) throws Exception;
}
