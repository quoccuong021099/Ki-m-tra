package CuongBo;

import java.util.ArrayList;

import CuongBean.Cuongbean;
import CuongDao.Cuongdao;

public class Cuongbo {
	static Cuongdao cdao = new Cuongdao();
	static ArrayList<Cuongbean> ds;
	public static ArrayList<Cuongbean> getcuong() throws Exception
	{
		ds=cdao.getcuong();
		return ds;	
	}
	public ArrayList<Cuongbean> TimTin(String key)
	
	{
		ArrayList<Cuongbean> tam = new ArrayList<Cuongbean>();
		for( Cuongbean s: ds)
			if(s.getTieude().toLowerCase().contains(key.toLowerCase()) || s.getNoidung().toLowerCase().contains(key.toLowerCase()))
		tam.add(s);
		return tam;
		
	}
}
