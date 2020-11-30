package CuongBean;

import java.util.Date ;

public class Cuongbean {
	private String matin;
	private String tieude; 
	private String tomtat; 
	private Date ngayduatin; 
	private String noidung;
	
	public Cuongbean(String matin, String tieude, String tomtat, Date ngayduatin, String noidung) {
		super();
		this.matin = matin;
		this.tieude = tieude;
		this.tomtat = tomtat;
		this.ngayduatin = ngayduatin;
		this.noidung = noidung;
	}

	/**
	 * @return the matin
	 */
	public String getMatin() {
		return matin;
	}

	/**
	 * @param matin the matin to set
	 */
	public void setMatin(String matin) {
		this.matin = matin;
	}

	/**
	 * @return the tieude
	 */
	public String getTieude() {
		return tieude;
	}

	/**
	 * @param tieude the tieude to set
	 */
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	/**
	 * @return the tomtat
	 */
	public String getTomtat() {
		return tomtat;
	}

	/**
	 * @param tomtat the tomtat to set
	 */
	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}

	/**
	 * @return the ngayduatin
	 */
	public Date getNgayduatin() {
		return ngayduatin;
	}

	/**
	 * @param ngayduatin the ngayduatin to set
	 */
	public void setNgayduatin(Date ngayduatin) {
		this.ngayduatin = ngayduatin;
	}

	/**
	 * @return the noidung
	 */
	public String getNoidung() {
		return noidung;
	}

	/**
	 * @param noidung the noidung to set
	 */
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	} 
	
	
}
