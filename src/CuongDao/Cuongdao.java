package CuongDao;

import java.security.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import CuongBean.Cuongbean;
import CuongDao.Dungchung;
public class Cuongdao {
	Dungchung dc = new Dungchung();
	public ArrayList<Cuongbean> getcuong() throws Exception
	{
		ArrayList<Cuongbean> ds = new ArrayList<Cuongbean>();
		dc.KetNoi();
		//B2: thiêìt lâòp câu lêònh sql
		String sql = "select * from LeQuocCuong ";
		//B3: lay du lieu ve
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		//B4: duyet qua cac don vi
		while(rs.next()) {
			String matin = rs.getString("matin");
			String tieude = rs.getString("tieude");
			String tomtat = rs.getString("tomtat");
			Date ngayduatin = rs.getDate("ngayduatin");
			String noidung = rs.getString("noidung");
			Cuongbean tin  = new Cuongbean(matin, tieude, tomtat, ngayduatin, noidung);
			ds.add(tin);
		}
		rs.close();
		dc.cn.close();
		return ds; 
	}
}
