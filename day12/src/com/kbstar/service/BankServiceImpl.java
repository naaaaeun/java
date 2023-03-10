package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImple;

public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {
	DAO<String, UserDTO> userdao;
	DAO<String, AccountDTO> accountdao;
	DAO<String, TransactionDTO> trdao;
	Notification notification;
	
	public BankServiceImpl() {
		this.userdao = new UserDAO();
		this.accountdao = new AccountDAO();
		this.notification = new NotificationImple();
		this.trdao = new TransactionDAO();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try{
			userdao.insert(v);
		}catch(Exception e) {
			throw new Exception("등록 오류");
		}
		notification.sendEmail(v.getEmail(), "등록 축하합니다");
		notification.sendSMS(v.getContact(), "등록 축하합니다");
		
	}

	@Override
	public UserDTO login(String K, String p) throws Exception {
		UserDTO user=null;
		user=userdao.select(K);
		if (user!=null) {
			if(user.getPwd().equals(p)) {
				System.out.println("ok");
			}else{
				throw new Exception("로그인 실패");
			}
		}else {
			throw new Exception("로그인 실패");
		}
		
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user=null;
		user=userdao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo=MakeAccountNumber.makeAccNum();
		AccountDTO account =new AccountDTO(accNo,balance, k);
		accountdao.insert(account);
		UserDTO user=userdao.select(k);
		notification.sendEmail(user.getEmail(), accNo+"계좌개설 완료");
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		
		return null;
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		System.out.println("금결원 전송");
		//계좌 정보 수정
		AccountDTO acc=null;
		acc= accountdao.select(sendAcc);
		//계좌 잔액 정보를 조회, 잔액에서 이체하는 금액을 차감한 잔액으로 수정
		double abanlance=acc.getBalance()-balance;
		acc.setBalance(abanlance);
		accountdao.update(acc);
		//거래 내역 추가
		TransactionDTO tr=new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc);
		trdao.insert(tr);
		//거래 후 알림
		String uid =acc.getHolder();
		UserDTO u=userdao.select(uid);
		notification.sendEmail(u.getEmail(), sendAcc+"에서 "+balance+"원 송금 완료");
		notification.sendSMS(u.getContact(), sendAcc+"에서 "+balance+"원 송금 완료");
		//완료
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
