package com.whu.service;

import com.alibaba.fastjson.JSONObject;

public interface VerifyService {

    String verify(JSONObject cert, String wallet, String password);

    String create(String password);

    String genProof(String position);

    String search(String _json);

    String deployContract(String wallet, String passWord);
}

