package com.gozoo.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class A_MemberDao {

	
	Connection conn = A_DBConnection.getConnection();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// Login Check Method Start
	public boolean loginCheck(A_MemberDto dto) {
		String sql = "SELECT COUNT(*) FROM MEMBER WHERE ID = ? AND PW = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int ret = rs.getInt(1);
					if(ret ==1) {
						return true;
					}else {
						return false;
					}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	// Login Check Method End
	
	
	
	// get Point Method Start 
	public int getPoint(A_MemberDto dto) {
		String sql = "SELECT POINT FROM MEMBER WHERE ID = ?";
		int point = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				point = rs.getInt("POINT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return point;
	}
	// get Point Method End
	
	
	// get Name Method Start
	public String getName(A_MemberDto dto) {
		String sql = "SELECT NAME FROM MEMBER WHERE ID = ?";
		String name = "";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				name = rs.getString("NAME");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
	// get Name Method End
	
	
	// registerAction Method Start
		public boolean registerAction(A_MemberDto dto) {
			String sql = "INSERT INTO MEMBER(ID,PW,NAME) VALUES(?,?,?)";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPw());
				pstmt.setString(3, dto.getName());
				int ret = pstmt.executeUpdate();
				if(ret == 1) {
					return true;
				}else {
					return false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	// registerAction Method End
	
	//minusPoint Method
		public void minusPoint(A_MemberDto dto) {
			String sql = "UPDATE MEMBER SET POINT = POINT - ? WHERE ID = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getPoint());
				pstmt.setString(2, dto.getId());
				
				int ret = pstmt.executeUpdate();
				if(ret == 1) {
					System.out.println("MINUS POINT COMPLETE");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	//minusPoint Method
		
		
		
	//plusPoint Method Start
		public void plusPoint(A_MemberDto dto) {
			String sql = "UPDATE MEMBER SET POINT = POINT + ? WHERE ID = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getPoint());
				pstmt.setString(2, dto.getId());
				
				int ret = pstmt.executeUpdate();
				if(ret == 1) {
					System.out.println("PLUS POINT COMPLETE");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//plusPoint Method End
	
		
		// getList Method Start
		public ArrayList<A_MemberDto> getList(){
			ArrayList<A_MemberDto> list = new ArrayList<A_MemberDto>();
			String sql = "SELECT * FROM MEMBER";
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String id = rs.getString("ID");
					String pw = rs.getString("PW");
					String name = rs.getString("NAME");
					int point = rs.getInt("POINT");
					
					list.add(new A_MemberDto(id,pw,name,point));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//System.out.println(list.toString());
			return list;
		}
		// getList Method End
	
		
		
		// deleteAction Method Start
		public void deleteAction(A_MemberDto dto) {
			String sql = "DELETE FROM MEMBER WHERE ID = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getId());
				int ret = pstmt.executeUpdate();
				if(ret == 1) {
					System.out.println("DELETE COMPLETE");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// deleteAction Method End
		
		
		
		//updateAction Method Start	
		public void updateAction(A_MemberDto dto) {
			String sql = "UPDATE MEMBER SET POINT = ?,PW = ?,NAME = ? WHERE ID = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getPoint());
				pstmt.setString(2, dto.getPw());
				pstmt.setString(3, dto.getName());
				pstmt.setString(4, dto.getId());
				int ret = pstmt.executeUpdate();
				System.out.println(ret + "@@@@@");
				if(ret == 1) {
					System.out.println("MEMBER INFO UPDATE COMPLETE");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//updateAction Method End
		
		
		
		
		// Start Method Start
		public void start(A_MemberDto dto){
			String sql = "UPDATE MEMBER SET POINT = POINT + 1 WHERE 3=3";
			try {
				pstmt = conn.prepareStatement(sql);
				int ret = pstmt.executeUpdate();
				if(ret == 1) {
					System.out.println("1점씩 추가하는중");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		// Start Method End
		
	
}
