package com.sindhu.utility;

import com.sindhu.dao.IUserDAO;
import com.sindhu.dao.UserDAOVersion2;

public class DAOUtility {
public static IUserDAO getUserDAO()//don't want to create an object(static)
{
	return new UserDAOVersion2();
	
}
}
