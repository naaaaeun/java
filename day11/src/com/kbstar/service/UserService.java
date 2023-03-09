package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImple;

public class UserService implements CRUDService<String, UserDTO> {
	DAO<String, UserDTO> userdao;
	Notification notification;
	
	public UserService() {
		userdao=new UserDAO();
		notification=new NotificationImple();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userdao.insert(v);
		}catch(Exception e) {
			throw new Exception("회원가입이 실패하였습니다.(ex001)");
		}
		notification.sendEmail(v.getEmail(), Msg.registerMsg1);
		notification.sendSMS(v.getContact(), Msg.registerMsg2);
	}

	@Override
	public void remove(String k) throws Exception {
		UserDTO user=null;
		user= userdao.select(k);
		try{
			userdao.delete(k);
		}catch(Exception e) {
			throw new Exception("탈퇴 오류입니다.");
		}
		notification.sendEmail(user.getEmail(), Msg.removeMsg1);
		notification.sendSMS(user.getContact(), Msg.removeMsg2);
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			userdao.update(v);
		}catch(Exception e) {
			throw new Exception("수정 오류입니다.");
			
		}
	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj =null;
		obj =userdao.select(k);
		return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception {
		List<UserDTO> list =null;
		try {
			list=userdao.select();
		}catch(Exception e) {
			throw new Exception("조회 오류");
		}
		return list;
	}

}
