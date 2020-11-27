package com.appsdeveloperblog.tutorials.legacyusersservice.service;

import com.appsdeveloperblog.tutorials.legacyusersservice.response.UserRest;

public interface UsersService {
   UserRest getUserDetails(String userName, String password);
   UserRest getUserDetails(String userName);
}
